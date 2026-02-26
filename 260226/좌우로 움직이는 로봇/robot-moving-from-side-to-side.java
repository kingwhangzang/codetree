import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        ArrayList<Integer> A = new ArrayList<>();
        ArrayList<Integer> B = new ArrayList<>();
        A.add(0); B.add(0);
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            int t = Integer.parseInt(st.nextToken());
            char d = st.nextToken().charAt(0);


            for(int j = 0; j < t; j++) {
                int last = A.get(A.size()-1);
                if(d == 'R') {
                    A.add(last+1);
                }
                else if(d == 'L') {
                    A.add(last-1);
                }
            }
        }

        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine());
            int t = Integer.parseInt(st.nextToken());
            char d = st.nextToken().charAt(0);

            for(int j = 0; j < t; j++) {
                int last = B.get(B.size()-1);
                if(d == 'R') {
                    B.add(last+1);
                }
                else if(d == 'L') {
                    B.add(last-1);
                }
            }
        }

        int maxLen = Math.max(A.size(), B.size());
        while (A.size() < maxLen) A.add(A.get(A.size() - 1));
        while (B.size() < maxLen) B.add(B.get(B.size() - 1));

        int cnt = 0;
        for(int i = 1; i < maxLen; i++) {
            if (A.get(i).intValue() == B.get(i).intValue() 
                    && A.get(i - 1).intValue() != B.get(i - 1).intValue()) {
                cnt++;
            }
        }
        System.out.println(cnt);
    }
}