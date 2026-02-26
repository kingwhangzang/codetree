import java.util.Scanner;

public class Main {
    static int [] dx = {0, 0, -1, 1}; // N S W E
    static int [] dy = {1, -1, 0, 0};

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int x = 0, y = 0;

        for (int i = 0; i < n; i++) {
            char direction = sc.next().charAt(0);
            int dis = sc.nextInt();

            int dir = 0;
            if (direction == 'N') dir = 0;
            else if (direction == 'S') dir = 1;
            else if (direction == 'W') dir = 2;
            else if (direction == 'E') dir = 3;

            x += dx[dir] * dis;
            y += dy[dir] * dis;
        }

        System.out.println(x + " " + y);
    }
}