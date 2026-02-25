import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int t = Integer.parseInt(st.nextToken());

        int cnt = 0;
        int max = 0;

        st = new StringTokenizer(br.readLine());
        for(int i = 0; i < n; i++) {
            int cur = Integer.parseInt(st.nextToken());
            if(cur > t) cnt++;
            else cnt = 0;
            max = Math.max(max, cnt);
        }
        System.out.println(max);
    }
}