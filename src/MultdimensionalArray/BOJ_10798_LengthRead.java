package MultdimensionalArray;
import java.util.*;
public class BOJ_10798_LengthRead {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String[] arr = new String[5];
        int maxLength = 0;
        for(int i =0 ;i<5;i++){
            arr[i] = sc.next();
            if(arr[i].length()>maxLength){
                maxLength = arr[i].length();
            }
        }
        StringBuilder result = new StringBuilder();
        for(int i =0 ; i<maxLength;i++){
            for(int j =0 ; j<5; j++){
                if(i<arr[j].length()){
                    result.append(arr[j].charAt(i));
                }
            }
        }
        System.out.println(result);
            }
        }
