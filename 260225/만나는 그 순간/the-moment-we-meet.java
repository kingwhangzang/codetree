import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int num = 0;

        ArrayList<Integer> A = new ArrayList<>();
        ArrayList<Integer> B = new ArrayList<>();

        A.add(0);
        B.add(0);
        for(int i = 0; i < n; i++) {
            char dir = sc.next().charAt(0);
            int move = sc.nextInt();
            for(int j = 0; j < move; j++) {
                int cur = A.get(A.size()-1);
                if(dir == 'R') A.add(cur + 1);
                if(dir == 'L') A.add(cur - 1);
            }
        }
        for(int i = 0; i < m; i++) {
            char dir = sc.next().charAt(0);
            int move = sc.nextInt();
            for(int j = 0; j < move; j++) {
                int cur = B.get(B.size()-1);
                if(dir == 'R') B.add(cur + 1);
                if(dir == 'L') B.add(cur - 1);
            }
        }

        int meet = 0;

        // "만나는 그 순간"만 카운트: (t-1에 다름) && (t에 같음)
        for (int t = 1; t < A.size(); t++) {
            if (!A.get(t - 1).equals(B.get(t - 1)) && A.get(t).equals(B.get(t))) {
                System.out.println(t);
                return;
            }
        }

        System.out.println(-1);
    }
}