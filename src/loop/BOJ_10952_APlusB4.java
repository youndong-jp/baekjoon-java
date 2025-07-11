package loop;
import java.util.Scanner;
public class BOJ_10952_APlusB4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean cal = true;
        while (cal) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            if ((a + b)==0) {
                cal = false;
            }else{
                System.out.println(a+b);
            }
        }
        sc.close();
    }
}
