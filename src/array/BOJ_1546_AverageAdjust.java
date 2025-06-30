package array;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class BOJ_1546_AverageAdjust {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        double [] score = new double[n];
        double max = 0;
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i=0;i<n;i++) {
            score[i] = Double.parseDouble(st.nextToken());
            if(max<score[i]){
                max = score[i];
            }
        }
        double sum = 0;
        for(int i=0;i<n;i++){
            sum+=(score[i]/max)*100.0;
        }
        System.out.println(sum/n);
    }
}
