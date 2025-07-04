package string;
import java.util.Arrays;
import java.util.Scanner;

public class BOJ_10809_AlphabetPositionFinder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int [] arr = new int[26];
        Arrays.fill(arr,-1);
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            int idx = ch - 'a';
            if(arr[idx]==-1){
                arr[idx]=i;
            }
            for(int alp :arr){
                System.out.print(alp+" ");
            }
        }
    }
}
