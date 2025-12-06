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

        //para cada elemento do array de strs atribua a 's' e execute os comandos
       for(String s : strs){
        // cria um array de 26 posições referente ao alfabeto americano
        int[] count = new int[26];
        // atribua cada letra desse elemento para a variavel 'c' e execute o comando
        for(char c : s.toCharArray()){
           //conta quantas vezes a letra atual aparece no array do count 
           count[c-'a']++;            
        }

        //reserva na memória a quantidade de referente a 26 letras do alfabeto e a virgula que separa a quantidade de letras do count
        StringBuilder sb = new StringBuilder(52);
           
        // atribua cada elemnto do count para a variavel 'x' e execute o comando
        for (int x : count){
            sb.append(x).append(',');
        }

        //Ttransforma o resultado do sb em String imutavel para o tablehash
        String key = sb.toString();

        //verifica se a key já existe no hash, se existir adciona no array correspondente, se não cria um novo array
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
