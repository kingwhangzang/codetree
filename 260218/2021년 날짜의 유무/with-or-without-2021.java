import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int d = sc.nextInt();
        int [] day = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        int D = day[m-1];
        if(d <= D) System.out.println("Yes");
        else System.out.println("No");
    }
}