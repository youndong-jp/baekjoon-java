package array;
import java.util.Scanner;

public class BOJ_2562_MaxValueAndIndex {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int max = 0;
        int index =0;
        for(int i =0;i<9;i++){
            int num = sc.nextInt();
            if(num>max){
                max = num;
                index = i+1;
            }
            }
        System.out.println(max);
        System.out.println(index);
        }
    }
