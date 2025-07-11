package condition;
import java.util.Scanner;

public class BOJ_2525_OvenClock {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt();
        int m = sc.nextInt();
        int pt = sc.nextInt();
        int totalMin = h * 60 + m + pt;
        h = (totalMin / 60) % 24;
        m = totalMin % 60;
        System.out.println(h + " " + m);

    }
}
