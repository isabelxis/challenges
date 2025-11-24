import java.util.HashMap;
import java.util.Map;
/*/
https://neetcode.io/quiz/two-sum
https://www.jdoodle.com/online-java-compiler
/*/

public class SomaDois {

    public int[] resultsSoma(int[] nums, int t ) {

        Map<Integer, Integer> somaMap = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int dif = t - nums[i];

            if (somaMap.containsKey(dif)){

                return new int[]{somaMap.get(dif), i};
            }

            somaMap.put(nums[i],i );
        }


        return new int[]{};
    }

    public static void main(String[] args){

        SomaDois check = new SomaDois();

        int[] nums = { 2,7,11,15};
        int target = 9;
        int[] result = check.resultsSoma(nums, target);

        System.out.println("[" + result[0] +","+ result[1]+"]");

    }
}
