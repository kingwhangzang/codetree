import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int[] a = new int[n1];
        int[] b = new int[n2];
        for (int i = 0; i < n1; i++)
            a[i] = sc.nextInt();
        for (int i = 0; i < n2; i++)
            b[i] = sc.nextInt();
        
        boolean Ok = true;
v:       for(int i = 0; i < n1; i++) {
            if(b[0] == a[i]) {
                for(int j = 0; j < n2; j++) {
                    if(b[j] != a[i+j]) {
                        Ok = false;
                        break v;
                    }
                }
            }
        }
        if(Ok == true) System.out.println("Yes");
        else System.out.println("No");
    }
}