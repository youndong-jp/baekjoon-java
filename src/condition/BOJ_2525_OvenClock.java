package condition;
import java.util.Scanner;

public class BOJ_2525_OvenClock {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt();
        int m = sc.nextInt();
        int pt = sc.nextInt();
        m += (pt%60);
        h += (pt/60);
        if(m>=60){
            m-=60;
            h+=1;
        }if(h>23){
            h-=24;
        }
        System.out.println(h+" "+m);

    }
}
