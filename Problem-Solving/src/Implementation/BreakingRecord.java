package Implementation;

import java.util.ArrayList;
import java.util.List;

public class BreakingRecord {

    public static List<Integer> breakingRecords(List<Integer> scores) {
        int minR = 0;
        int maxR = 0;
        int min = scores.getFirst();
        int max = scores.getFirst();

        for(int i = 1; i < scores.size(); i++) {
            if(scores.get(i) < min) {
                min = scores.get(i);
                minR++;
            } else if(scores.get(i) > max) {
                max = scores.get(i);
                maxR++;
            }
        }
        List<Integer> m = new ArrayList<>();
        m.add(minR);
        m.add(maxR);
        return m;
    }

    public static void main(String[] args) {
        List<Integer> scores = List.of(10, 5, 20, 20, 4, 5, 2, 25, 1);
        List<Integer> result = breakingRecords(scores);
        System.out.println("Minimum number of breaks: " + result.get(0));
        System.out.println("Maximum number of breaks: " + result.get(1));
    }
}
