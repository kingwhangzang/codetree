import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());


        int prev = Integer.parseInt(br.readLine());
        int cnt = 0;
        int max = 0;
        for (int i = 1; i < n; i++) {
            int cur = Integer.parseInt(br.readLine());

            if(cur > prev) {
                cnt++;
            }
            else {
                cnt = 1;
            }
            prev = cur;
            max = Math.max(max, cnt);
        }
        System.out.println(max);
    }
}