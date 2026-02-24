import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String binary = sc.next();
        
        // 십진수로 변환
        int N = 0;
        for (int i = 0; i < binary.length(); i++) {
            int bit = binary.charAt(i) - '0';  // 0 or 1
            N = N * 2 + bit;
        }

        // 17배
        N *= 17;

        // 이진수로 변환
        if (N == 0) {
            System.out.println(0);
            return;
        }

        StringBuilder sb = new StringBuilder();
        while (N > 0) {
            sb.append(N % 2);
            N /= 2;
        }

        System.out.println(sb.reverse().toString());
    }
}