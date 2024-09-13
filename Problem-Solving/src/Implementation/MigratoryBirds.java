package Implementation;

import java.util.*;

public class MigratoryBirds {

    public static int migratoryBirds(List<Integer> arr) {
        /*SortedMap<Integer,Integer> sortedMap = new TreeMap<>();
        for(Integer a: arr){
            sortedMap.put(a,sortedMap.getOrDefault(a,0)+1);
        }
        for(Integer s : sortedMap.keySet()){
            System.out.println(s + ":" + sortedMap.get(s));
        }*/
        HashMap<Integer,Integer> counterMap = new LinkedHashMap<>();
        int maxCount = 0;
        for(Integer a : arr){
            counterMap.put(a,counterMap.getOrDefault(a,0)+1);
        }

        /*for(Integer s : counterMap.keySet()){
            System.out.println(s + ":" + counterMap.get(s));
        }*/

        int max = Collections.max(counterMap.values());
        for(Map.Entry<Integer,Integer> entry : counterMap.entrySet()){
            if(entry.getValue() == max){
                maxCount =  entry.getKey();
            }
        }
        return maxCount;
    }
    public static void main(String[] args) {
        List<Integer> arr = List.of(1 ,2 ,3 ,4 ,5 ,4, 3 ,2 ,1 ,3 ,4);
        int result = migratoryBirds(arr);
        System.out.println("Migratory birds: " + result);
    }
}
