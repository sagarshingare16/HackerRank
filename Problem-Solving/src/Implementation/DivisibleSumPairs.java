package Implementation;

import java.util.List;

public class DivisibleSumPairs {

    public static int divisibleSumPairs(int n, int k, List<Integer> a) {
        int count = 0;
        for(int i = 0; i < n; i++) {
            for(int j = i + 1; j < n; j++) {
                if((a.get(i) + a.get(j)) % k == 0) {
                    count++;
                }
            }
        }
        return count;

    }
    public static void main(String[] args) {

        List<Integer> a = List.of(1, 3, 2, 6, 1, 2);
        int n = 6;
        int k = 3;
        int result = divisibleSumPairs(n, k, a);
        System.out.println("Number of pairs: " + result);

    }
}
