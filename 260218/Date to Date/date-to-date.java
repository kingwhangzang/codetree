import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m1 = sc.nextInt();
        int d1 = sc.nextInt();
        int m2 = sc.nextInt();
        int d2 = sc.nextInt();
        
        int num1 = 0, num2 = 0;
        int[] days = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        
        // m1 날짜
        for (int i = 1; i < m1; i++) {
            num1 += days[i];
        }
        num1 += d1;

        // m2 날짜
        for (int i = 1; i < m2; i++) {
            num2 += days[i];
        }
        num2 += d2;

        int num = num2 - num1 + 1;
        System.out.print(num);
    }
}