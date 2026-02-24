import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String res = "";

        while (n > 0) {
            res += (n % 2);

            n /= 2;
        }

        String answer = new StringBuilder(res).reverse().toString();
        System.out.println(answer);
    }
}