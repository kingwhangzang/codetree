import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int [] map = new int [202];
        
        for (int i = 0; i < N; i++) {
            int A = sc.nextInt();
            int B = sc.nextInt();

            for(int j = A; j < B; j++) {
                map[j]++;
            }
        }

        int M = Integer.MIN_VALUE;
        for(int i = 0; i < map.length; i++) {
            M = Math.max(M, map[i]);
        }

        System.out.println(M);
    }
}