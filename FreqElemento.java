import java.util.*;
/*
https://neetcode.io/problems/top-k-elements-in-list/question
https://www.jdoodle.com/online-java-compiler
*/

public class FreqElemento {
    public int[] topKFrequent(int[] nums, int k) {

        Map<Integer, Integer> map = new HashMap<>();

        //conta a frequencia dos elementos do array
        for(int num : nums){
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        //cria uma lista com o tamanho máximo de frequencia possivel -- se o tamanho do array é 5 a qtd máxima de frequencia é 5.
        List<Integer>[] bucket = new List[nums.length +1];
        //inclui a quantidade de frequencia no bucket correspondente a quantidade
        for (int key : map.keySet()){
            int freq = map.get(key);
            if (bucket[freq] == null){
                bucket[freq] = new ArrayList<>();
            }
            bucket[freq].add(key);
        }

        List<Integer> count = new ArrayList<>();
        //percorre o array do bucket do maior para o menor para identificar a maior quantidade de frequencia
        for(int i = bucket.length -1; i >= 0 && count.size() < k; i--){
            if(bucket[i] != null){
                count.addAll(bucket[i]);
            }
        }
        //converte em stream funcional, converte e um inteiro primitivo, limita apenas a quantidade em k e converte para array
        return count.stream().mapToInt(Integer::intValue).limit(k).toArray();
    }

    public static void main(String[] args){

        FreqElemento check = new FreqElemento();

        int[] nums = {1,2,2,3,3,3};
        int k = 2;

        System.out.println(Arrays.toString(check.topKFrequent(nums,k)));

    }

}
