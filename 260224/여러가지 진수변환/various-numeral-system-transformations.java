import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int b = sc.nextInt();

        StringBuilder sb = new StringBuilder();

        if (N == 0) {
            System.out.println(0);
            return;
        }
        
        while (N > 0) {
            int r = N % b;

            if (r >= 10) sb.append((char)(r - 10 + 'A'));
            else sb.append(r);

            N /= b;
        }

        System.out.println(sb.reverse());
    }
}