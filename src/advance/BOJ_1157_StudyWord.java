package advance;
import java.util.Locale;
import java.util.Scanner;
public class BOJ_1157_StudyWord {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String word = sc.nextLine().toUpperCase();
        int [] count = new int[26];
        for(int i=0;i<word.length();i++){
           char ch = word.charAt(i);
           count[ch-'A']++;
        }
        int max = -1;
        char result = '?';
        for(int i =0;i<26;i++){
            if(count[i]>max) {
                max = count[i];
                result = (char) (i + 'A');
            }else if (count[i]==max){
                result = '?';
            }
        }
        System.out.println(result);
    }
}
