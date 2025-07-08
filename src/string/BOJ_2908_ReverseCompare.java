import java.util.Scanner;

public class BOJ_2908_ReverseCompare {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String [] INT = sc.nextLine().split(" ");
        int a = Integer.parseInt(new StringBuilder(INT[0]).reverse().toString());
        int b = Integer.parseInt(new StringBuilder(INT[1]).reverse().toString());
        if(a > b){
            System.out.println(a);
        }else{
            System.out.println(b);
        }
    }
}
