import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }

        int st = -1;
        int cnt = 0;
        int max = 0;
        for (int i = 0; i < n; i++) {
            int cur = arr[i];

            if(cur == st) {
                cnt++;
            }
            else {
                cnt = 1;
                st = cur;
            }
            max = Math.max(max, cnt);
        }
        System.out.println(max);
    }
}