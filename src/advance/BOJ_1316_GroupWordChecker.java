package advance;
import java.util.Scanner;
public class BOJ_1316_GroupWordChecker {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int score=0;
        for(int i =0;i<n;i++){
           String a = sc.next();
           boolean[] visited = new boolean[26];
           boolean isGroup = true;

           char prev = 0;

           for(int j =0;j<a.length();j++){
               char current = a.charAt(j);

               if(current!=prev){
                   if(visited[current-'a']){
                       isGroup = false;
                       break;
                   }
                   visited[current-'a'] = true;
               }
               prev = current;
           }
            if(isGroup){
                score++;
            }
        }
        System.out.println(score);
    }
}
