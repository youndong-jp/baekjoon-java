package string;
import java.util.Scanner;
public class BOJ_2675_StringRepeater {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int r = sc.nextInt();
            String s = sc.next();
            String answer = "";
            for(int j=0;j<s.length();j++){
                char ch = s.charAt(j);
                for(int k=0;k<r;k++){
                    answer += ch;
                }
            }
            System.out.println(answer);
        }
    }
}