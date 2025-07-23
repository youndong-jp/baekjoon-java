package advance;
import java.util.Scanner;

public class BOJ_3003_Chess {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] chess = {1, 1, 2, 2, 2, 8};
        for (int i = 0; i < 6; i++) {
            int piece = sc.nextInt();
            System.out.print(chess[i]-piece+" ");
        }
    }
}