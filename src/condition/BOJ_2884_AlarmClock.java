package condition;
import java.util.Scanner;
public class BOJ_2884_AlarmClock {
    public static void main(String[] arg) {
        Scanner sc = new Scanner(System.in);
        int H = sc.nextInt(); //시간 시
        int M = sc.nextInt(); //시간 분
        M -= 45;
        if (M<0) {
            M += 60;
            H -= 1;
            if (H < 0) {
                H = 23;
            }
        }
        System.out.println(H+" "+M);
    }
}

