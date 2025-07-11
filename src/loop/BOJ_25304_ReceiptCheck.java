package loop;
import java.util.Scanner;
public class BOJ_25304_ReceiptCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long x = sc.nextLong();
        int  n = sc.nextInt();
        int cost = 0;
        for (int i = 1; i <= n; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            cost += a * b;
        }
        if (x == cost) {
            System.out.println("Yes");
        }else  {
            System.out.println("No");
        }
    }

}
