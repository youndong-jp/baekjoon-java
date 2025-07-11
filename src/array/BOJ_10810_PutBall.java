package array;
import java.util.Scanner;
public class BOJ_10810_PutBall {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int [] arr = new int[n];
        for(int t=0;t<m;t++){
            int i = sc.nextInt();
            int j = sc.nextInt();
            int k = sc.nextInt();
            for(int a=i-1;a<j;a++){
                arr[a] = k;
        }
            }
        for(int val:arr){
            System.out.print(val+" ");
        }




    }
}
