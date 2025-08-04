package MultdimensionalArray;
import java.util.*;
public class BOJ_2566_Max {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[][] a = new int[9][9];
        int row =0,col =0;
        int max = -1;
        for(int i =0;i<9;i++){
            for(int j =0 ; j<9;j++){
                a[i][j]=sc.nextInt();

                if(a[i][j]>max){
                    max = a[i][j];
                    row=i;
                    col=j;
                }
            }
        }
        System.out.println(max);
        System.out.println((row+1)+" "+(col+1));
    }
}
