import java.util.HashSet;
import java.util.Set;

/*/
https://neetcode.io/quiz/contains-duplicate
https://www.jdoodle.com/online-java-compiler
/*/

public class ContainsDuplicate {
    public boolean nextDuplicate(int[] nums){

        if (nums == null || nums.length <= 1) {
            return false;
        }

        Set<Integer> hash = new HashSet<>();

        for (int i = 0; i < nums.length; i++) {
            int currentNum = nums[i];

            if (hash.contains(currentNum)) {
                return true;
            }
            hash.add(currentNum);
        }

        return false;
    }

    public static void main(String[] args) {

        ContainsDuplicate check = new ContainsDuplicate();

        int[] nums1 = {1,2,3,1};
        System.out.println(check.nextDuplicate(nums1)); // Output: true

        int[] nums2 = {1,2,3,4};
        System.out.println(check.nextDuplicate(nums2)); // Output: false

    }

}
