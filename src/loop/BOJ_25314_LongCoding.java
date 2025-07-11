package loop;
import java.util.Scanner;

public class BOJ_25314_LongCoding {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String result = "";
        for(int i = 1; (i*4) <= n; i++){
            result += "long ";
        }
        result += "int";
        System.out.println(result);
    }
}
