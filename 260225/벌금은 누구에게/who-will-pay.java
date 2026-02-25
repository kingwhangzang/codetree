import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // 학생 수
        int m = sc.nextInt(); // 벌칙 받는 애
        int k = sc.nextInt(); //K번 이상 벌칙이면 벌금
        int[] penalizedPerson = new int[n+1];
        for (int i = 0; i < m; i++) {
            int num = sc.nextInt();
            penalizedPerson[num]++;
            if(penalizedPerson[num] >= k) {
                System.out.println(num);
                return;
            }
            
        }
        System.out.println(-1);
    }
}