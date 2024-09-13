package Implementation;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class SalesByMatch {

    public static int sockMerchant(int n, List<Integer> ar) {
        HashMap<Integer, Integer> map = new LinkedHashMap<>() ; //<value, count>
        int count = 0;
        for(Integer a : ar) {
            map.put(a, map.getOrDefault(a, 0) + 1);
        }
        for(Map.Entry<Integer, Integer> entry : map.entrySet()) {
            count += entry.getValue() / 2;
        }
        return count;
    }
    public static void main(String[] args) {

        List<Integer> ar = List.of(10, 20, 20, 10, 10, 30, 50, 10, 20);
        int result = sockMerchant(9, ar);
        System.out.println("Sales by match: " + result);
    }
}
