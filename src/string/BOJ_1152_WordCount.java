package string;
import java.util.Scanner;

public class BOJ_1152_WordCount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine().trim();
        if(str.isEmpty()){
            System.out.println(0);
        }else{
            String[] strArr = str.split("\\s+");
            System.out.println(strArr.length);
        }
    }
}
