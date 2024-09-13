package Implementation;

import java.util.List;

public class BillDivision {

    public static void bonAppetit(List<Integer> bill, int k, int b) {
        int sum = 0;
        for(int i = 0; i < bill.size(); i++) {
            if(i != k) {
                sum += bill.get(i);
            }
        }
        int bActual = sum / 2;
        if(bActual == b) {
            System.out.println("Bon Appetit");
        } else {
            System.out.println(b - bActual);
        }
    }
    public static void main(String[] args) {
        bonAppetit(List.of(3,10,2,9),1,12);
    }
}
