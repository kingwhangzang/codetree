import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String binary = sc.next();
        int n = 0;
        int L = binary.length();
        for(int i = 0; i < L; i++) {
            int bit = binary.charAt(i) - '0';
            n = n * 2 + bit;
        }

        System.out.println(n);
    }
}