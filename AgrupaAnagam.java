import java.util.HashMap;
import java.util.Map;
import java.util.List;
import java.util.ArrayList;
/*
https://neetcode.io/problems/anagram-groups/question
https://www.jdoodle.com/online-java-compiler
*/
public class AgrupaAnagam {
    public List<List<String>> groupAnagrams(String[] strs) {

       Map<String,List<String> > map = new HashMap<>();

       for(String s : strs){
        int[] count = new int[26];
        for(char c : s.toCharArray()){
           count[c-'a']++;            
        }

        StringBuilder sb = new StringBuilder(52);
        for (int x : count){
            sb.append(x).append(',');
        }

        String key = sb.toString();

        map.computeIfAbsent(key,k-> new ArrayList<>()).add(s);

       }

       return new ArrayList<>(map.values());
    }
    
    
     public static void main(String[] args){

        AgrupaAnagam check = new AgrupaAnagam();

        String[] strs = {"act","pots","tops","cat","stop","hat"};

        System.out.println(check.groupAnagrams(strs));

    }
    
}
