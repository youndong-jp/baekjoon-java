package array;
import java.util.Scanner;

public class BOJ_5597_MissingHomework {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean [] submitted = new boolean[31];
        for(int i=0;i<28;i++){
            int n = sc.nextInt();
            submitted[n] = true;
            }
        for(int j=1;j<=30;j++){
            if(!submitted[j]){
                System.out.println(j);
            }
        }
    }
}
