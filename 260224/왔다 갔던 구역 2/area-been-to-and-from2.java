import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int res = 0;
        for (int i = 0; i < N; i++) {
            int x = sc.nextInt();
            char dir = sc.next().charAt(0);

            if (dir == 'R') res += x;
            else if (dir == 'L') res -= x;
        }

        System.out.println(res);
    }
}