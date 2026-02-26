import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken()); // 개발자 전체 수
        int K = Integer.parseInt(st.nextToken()); // 한사람이 악수 횟수
        int P = Integer.parseInt(st.nextToken()); // 처음 걸린 개발자
        int T = Integer.parseInt(st.nextToken()); // 전체 악수 횟수

        int[][] shakes = new int[T][3];

        for (int i = 0; i < T; i++) {
            st = new StringTokenizer(br.readLine());
            shakes[i][0] = Integer.parseInt(st.nextToken());
            shakes[i][1] = Integer.parseInt(st.nextToken());
            shakes[i][2] = Integer.parseInt(st.nextToken());
        }

        // 초 기준으로 정렬
        Arrays.sort(shakes, (a, b) -> a[0] - b[0]);

        int [] cnt = new int [N+1]; // 한 사람 당 악수 횟수 저장배열
        boolean [] inflec = new boolean[N+1];
        inflec[P] = true;

        for (int i = 0; i < T; i++) {
            int x = shakes[i][1];
            int y = shakes[i][2];

            // 둘 다 비감염이면 아무 일도 없음
            if (!inflec[x] && !inflec[y]) continue;

            // 감염자인 쪽은 "악수(전염 시도)" 횟수 증가
            if (inflec[x]) cnt[x]++;
            if (inflec[y]) cnt[y]++;

            // 전염: 악수 당시 감염자이면서, 증가 후 cnt <= K 이면 상대 감염
            if (inflec[x] && cnt[x] <= K) inflec[y] = true;
            if (inflec[y] && cnt[y] <= K) inflec[x] = true;
        }
        StringBuilder sb = new StringBuilder();
        for(int i = 1; i <= N; i++) {
            sb.append(inflec[i] ? 1 : 0);
        }
        System.out.println(sb.toString());
    }
}