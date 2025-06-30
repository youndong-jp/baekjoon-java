package array;
import java.util.Scanner;

public class BOJ_10811_BasketReverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] arr = new int[n];
        for (int t = 0; t < n; t++) {
            arr[t] = t+1;
        }
        for (int t =0; t < m; t++) {
            int i = sc.nextInt();
            int j = sc.nextInt();
            int start = i - 1;
            int end = j - 1;
            while (start < end) {
                int temp = arr[start];
                arr[start] = arr[end];
                arr[end] = temp;
                start++;
                end --;
            }
        }
            for(int val :arr){
                System.out.print(val + " ");
            }
        }
    }
