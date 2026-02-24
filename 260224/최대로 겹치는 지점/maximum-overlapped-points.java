import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] map = new int[102];

        for (int i = 0; i < n; i++) {
            int A = sc.nextInt();
            int B = sc.nextInt();

            for (int j = A; j <= B; j++) {
                map[j]++;
            }
        }

        int max = 0;
        for (int i = 0; i < map.length; i++) {
            max = Math.max(max, map[i]);
        }

        System.out.println(max);
    }
}