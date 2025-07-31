package advance;
import java.util.Scanner;

public class BOJ_2941_CAlphabet {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String[] cap = {"c=","c-","dz=","d-","lj","nj","s=","z="};
        String ap = sc.nextLine();
        for(String ch:cap){
            ap = ap.replace(ch,"*");
        }
        System.out.println(ap.length());
    }
}
