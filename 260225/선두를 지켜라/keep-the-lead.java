import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        ArrayList<Integer> A = new ArrayList<>();
        ArrayList<Integer> B = new ArrayList<>();

        A.add(0);
        B.add(0);
        for(int i = 0; i < n; i++) {
            int v = sc.nextInt();
            int t = sc.nextInt();
            for(int j = 0; j < t; j++) {
                int cur = A.get(A.size()-1);
                A.add(cur + v);
            }
        }

        for(int i = 0; i < m; i++) {
            int v = sc.nextInt();
            int t = sc.nextInt();
            for(int j = 0; j < t; j++) {
                int cur = B.get(B.size()-1);
                B.add(cur + v);
            }
        }

        int cnt = 0;
        int prevLeader = 0;

        for(int t = 1; t < A.size(); t++) {
            int leader;
            if (A.get(t) > B.get(t)) leader = 1;
            else if (A.get(t) < B.get(t)) leader = -1;
            else leader = 0;

            if (leader != 0) {
                if (prevLeader != 0 && leader != prevLeader) cnt++;
                prevLeader = leader;
            }
        }


        System.out.println(cnt);
    }
}