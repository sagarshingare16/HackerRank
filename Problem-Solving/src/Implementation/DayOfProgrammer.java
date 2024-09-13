package Implementation;

public class DayOfProgrammer {

    public static boolean isLeap(int year){
        if(year<1918){
            return year % 4 == 0;
        }else{
            return year % 400 == 0 || (year % 4 == 0 && year % 100 != 0);
        }

    }

    public static String dayOfProgrammer(int year) {
        if(year == 1918){
            return "26.09.1918";
        }
        if(isLeap(year)){
            return "12.09." + year;
        }else{
            return "13.09." + year;
        }
    }
    public static void main(String[] args) {

        System.out.println("Day of Programmer: " + dayOfProgrammer(1918));

    }
}
