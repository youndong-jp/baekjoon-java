package calculation;

import java.util.Scanner;

public class BOJ_2588_Multiply {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = (a*(b%10));
        int d = (a*((b/10)%10));
        int e = (a*(b/100));
        System.out.println(c+"\n"+d+"\n"+e+"\n"+(a*b));

    }
}
