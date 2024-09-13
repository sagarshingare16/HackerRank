package Implementation;

import java.util.List;

public class SubArrayDivision {

    public static int birthday(List<Integer> s, int d, int m) {
        int count = 0;
        for(int i = 0; i < s.size(); i++) {
            int sum = 0;
            for(int j = i; j < (i + m) && j < s.size(); j++) {
                sum += s.get(j);
            }
            if(sum == d) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        List<Integer> s = List.of(2, 5, 1, 3, 4, 4, 3, 5, 1, 1, 2, 1, 4, 1, 3, 3, 4, 2, 1);
        int d = 18;
        int m = 7;
        int result = birthday(s, d, m);
        System.out.println("Number of subArrays: " + result);
    }
}
