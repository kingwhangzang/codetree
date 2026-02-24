import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        String N = sc.next();
        // Please write your code here.

        // A진수 > 10진수
        int L = N.length();
        int Num = 0;

        for(int i = 0; i < L; i++) {
            int bit = N.charAt(i) - '0';
            Num = Num * A + bit;
        }

        // 10진수 > B진수
        StringBuilder sb = new StringBuilder();
        
        while(Num > 0) {
            sb.append(Num % B);
            Num /= B;
        }

        System.out.println(sb.reverse().toString());
    }
}