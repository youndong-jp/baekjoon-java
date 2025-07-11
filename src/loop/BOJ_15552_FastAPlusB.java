package loop;

import java.io.*;
import java.util.StringTokenizer;

public class BOJ_15552_FastAPlusB {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        long t = Long.parseLong(br.readLine());
        for (int i = 0; i < t; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            bw.write((a+b)+"\n");
        }
        bw.flush();
        bw.close();
    }
}
