package advance;
import java.util.Scanner;
public class BOJ_10988_Palindrome {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String  word = sc.nextLine();
        int len = word.length();

        for(int i =0;i<len/2;i++){
            if(word.charAt(i)!=word.charAt(len-1-i)){
                System.out.println(0);
                return;
            }
        }
        System.out.println(1);
    }
}
