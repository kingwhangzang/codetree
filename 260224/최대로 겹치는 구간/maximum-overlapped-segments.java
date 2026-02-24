import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int OFFSET = 100; // 수가 음수인 경우가 존재하기 때문에 + 100을 해줘서 양수로 만들자 
        int [] map = new int [205];
        
        for (int i = 0; i < N; i++) {
            int A = sc.nextInt();
            int B = sc.nextInt();

            for(int j = A; j < B; j++) {
                map[j+OFFSET]++;
            }
        }

        int M = Integer.MIN_VALUE;
        for(int i = 0; i < map.length; i++) {
            M = Math.max(M, map[i]);
        }

        System.out.println(M);
    }
}