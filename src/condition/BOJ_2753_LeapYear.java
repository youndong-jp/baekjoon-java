package condition;
import java.util.Scanner;

public class BOJ_2753_LeapYear {
    public static void main(String [] arg){
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();
        sc.close();
        if (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0)) {
            System.out.println(1);
        }else{
            System.out.println(0);
        }
    }
}
