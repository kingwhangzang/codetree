import java.util.Scanner;
public class Main {
    // 오 아 왼 위
    static int [] dr = {0, 1, 0, -1};
    static int [] dc = {1, 0, -1, 0};

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int [][] map = new int [n][m];
        
        int r = 0, c = 0;
        int dir = 0;
        
        for(int val = 1; val <= n*m; val++) {
            map[r][c] = val;
            
            int nr = r + dr[dir];
            int nc = c + dc[dir];
            
            if(nr < 0 || nr >= n || nc < 0 || nc >= m) {
                dir = (dir + 1) % 4;
                nr = r + dr[dir];
                nc = c + dc[dir];
            }
            r = nr;
            c = nc;            
        }
        
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < m; j++) {
                System.out.println(map[i][j] + " ");
            }
            System.out.println();
        }
    }
}
