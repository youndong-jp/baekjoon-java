package array;
import java.util.Scanner;
import java.util.Set;
import java.util.HashSet;

public class BOJ_3052_RemainderSet {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Set<Integer> set = new HashSet<>();
        for(int i=0;i<10;i++){
            int n = sc.nextInt();
            set.add(n%42);
        }
        System.out.println(set.size());
    }
}
