package string;
import java.util.Scanner;

public class BOJ_27866_StringChar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int n = sc.nextInt();
        System.out.println(s.charAt(n-1));
    }
}

