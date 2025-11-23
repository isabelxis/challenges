import java.text.Normalizer;
import java.util.regex.Pattern;

/*/
https://neetcode.io/quiz/valid-palindrome
https://www.jdoodle.com/online-java-compiler
/*/

public class Palindrome {

    public boolean isPalindrome(String p){
        //Uma sequência vazia ou nula é um palíndromo
        if (p == null || p.isEmpty()){
           return true;
        }

        int left = 0;
        int right = p.length() - 1;

        while (left < right){
            //desconsidera o que não é caractere alfanumérico
            while (left < right && !Character.isLetterOrDigit(p.charAt(left))){
                left ++;
            }

            while (left < right && !Character.isLetterOrDigit(p.charAt(right))){
                right --;
            }
            //compara os caracteres transformados em letras minúsculas
            if (Character.toLowerCase(p.charAt(left)) != Character.toLowerCase(p.charAt(right))){
                return false;
            }

            left ++;
            right --;
        }

        return true;
    }


    
    public static void main(String[] args){

        Palindrome check = new Palindrome();
        String text = "socorram-me, subi no ônibus em Marrocos";

        System.out.println(text +" é um palíndromo: " + check.isPalindrome(removeaccent(text)));
    }

    public static String removeaccent(String str) {

        //separa os caracteres acentuados de seus acentos
        String nfdNormalizedString = Normalizer.normalize(str, Normalizer.Form.NFD);
        
        //padrões de caracteres unicode
        Pattern pattern = Pattern.compile("\\p{InCombiningDiacriticalMarks}+");

        return pattern.matcher(nfdNormalizedString).replaceAll("");
    }
}
