package string;
import java.util.Scanner;

public class BOJ_9086_FirstLastChar {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int i = 0; i < t; i++){
            String str = sc.next();
            System.out.println(str.charAt(0)+""+str.charAt(str.length()-1));
        }
    }
}
