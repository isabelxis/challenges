import java.util.HashMap;
import java.util.Map;
/*/
https://neetcode.io/quiz/valid-anagram
https://www.jdoodle.com/online-java-compiler
/*/

public class Anagram {
    public boolean isAnagram( String s, String t ){
        // tamanhos diferentes não são anagramas
        if (s.length() != t.length()){
            return false;
        }

        Map<Character, Integer> countMap = new HashMap<>();
        //popula o hashmap com a quantidade dos caracteres do s
        for (char c : s.toCharArray()){

            countMap.put(c, countMap.getOrDefault(c,0) + 1);
        }

        //itera com o t e decrementa o elemento que encontrar
        for (char c : t.toCharArray()){

            if(!countMap.containsKey(c) || countMap.get(c) == 0){
                return false;
            }
            countMap.put(c, countMap.get(c) - 1);
        }

        return true;
    }

    public static void main(String[] args) {
        Anagram check = new Anagram();

        System.out.println(check.isAnagram("anagram", "nagaram")); // true
        System.out.println(check.isAnagram("rat", "car"));       // false
        System.out.println(check.isAnagram("heart", "earth"));    // false
    }
}
