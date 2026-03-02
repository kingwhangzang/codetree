import java.io.*;
import java.util.*;

public class Main {
    // 왼 오 위 아
    static int[] dr = {0, 0, -1, 1};
    static int[] dc = {-1, 1, 0, 0};

    static int opp(int dir) {
        if(dir == 0) return 1;
        if(dir == 1) return 0;
        if(dir == 2) return 3;
        return 2;
    }

    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int T = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        int R = Integer.parseInt(st.nextToken()) - 1;
        int C = Integer.parseInt(st.nextToken()) - 1;
        char D = st.nextToken().charAt(0);

        int dir = 0;
        if(D == 'L') dir = 0;
        else if(D == 'R') dir = 1;
        else if(D == 'U') dir = 2;
        else if(D == 'D') dir = 3;

        for(int i = 0; i < T; i++) {
            int nr = R + dr[dir];
            int nc = C + dc[dir];
            
            if(nr < 0 || nr >= N || nc < 0 || nc >= N) {
                dir = opp(dir);
            } else {
                R = nr;
                C = nc;
            }
        }
        System.out.println((R+1) + " " + (C+1));

    }
}
