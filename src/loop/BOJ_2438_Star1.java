package loop;
import java.util.Scanner;

public class BOJ_2438_Star1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String m = "";
        for (int i = 1; i <= n; i++) {
            m +="*";
            System.out.println(m);
        }
        sc.close();
    }
}
