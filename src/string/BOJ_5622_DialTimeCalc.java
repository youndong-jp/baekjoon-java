package string;
import java.util.Scanner;

public class BOJ_5622_DialTimeCalc {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String dial = sc.nextLine().toUpperCase();
        int time = 0;
        for (int i = 0; i < dial.length(); i++) {
            char ch = dial.charAt(i);
            if (ch >= 'A' && ch <= 'C') {
                time += 3;
            } else if (ch >= 'D' && ch <= 'F') {
                time += 4;
            } else if (ch >= 'G' && ch <= 'I') {
                time += 5;
            } else if (ch >= 'J' && ch <= 'L') {
                time += 6;
            } else if (ch >= 'M' && ch <= 'O') {
                time += 7;
            } else if (ch >= 'P' && ch <= 'S') {
                time += 8;
            } else if (ch >= 'T' && ch <= 'V') {
                time += 9;
            } else if (ch >= 'W' && ch <= 'Z') {
                time += 10;
            }
        }
        System.out.println(time);
    }
}
