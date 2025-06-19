package condition;
import java.util.Scanner;
public class BOJ_2884_AlarmClock {
    public static void main(String[] arg){
        Scanner sc = new Scanner(System.in);
        int H = sc.nextInt(); //시간 시
        int M = sc.nextInt(); //시간 분
        int Minute = (M-45); //45분 줄이기
        int LessMinute = ((60+M)-45); // 분이 부족할때 계산
        int Hour = (H - 1);//시간 계산
        if(H == 0) {
            H = 24;
            int ZeroHour = (H - 1);//시간 계산
            if (M > 45) {
                System.out.print(ZeroHour + " " + Minute);
            } else if (M < 45) {
                System.out.print(ZeroHour + " " + LessMinute);
            }else  {
                System.out.print("0" + " " + "0");
            }
        }else{
            if (M > 45) {
                System.out.print(H + " " + Minute);
            } else if (M < 45) {
                System.out.print(Hour + " " + LessMinute);
            }else{
                System.out.print(H + " " + Minute);
            }

        }
    }

}
