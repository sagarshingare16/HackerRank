package Implementation;

import java.util.List;

public class BetweenTwoSeats {

    public static int gcd(int a, int b){
        while(b!=0){
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    public static int lcm(int a, int b) {
        return a * (b / gcd(a, b));
    }

    public static int gcdOfArray(List<Integer> arr) {
        int result = arr.getFirst();
        for (int num : arr) {
            result = gcd(result, num);
        }
        return result;
    }

    public static int lcmOfArray(List<Integer> arr) {
        int result = arr.getFirst();
        for (int num : arr) {
            result = lcm(result, num);
        }
        return result;
    }

    public static int getTotalX(List<Integer> a, List<Integer> b) {
        int lcmA = lcmOfArray(a);
        int gcdB = gcdOfArray(b);

        int count = 0;
        for (int multiple = lcmA; multiple <= gcdB; multiple += lcmA) {
            if (gcdB % multiple == 0) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        List<Integer> A = List.of(2, 4);
        List<Integer> B = List.of(16, 32, 96);

        int result = getTotalX(A, B);
        System.out.println("Number of integers between the sets: " + result);
    }
}
