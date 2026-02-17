import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        char o = sc.next().charAt(0);
        int c = sc.nextInt();
        
        if(o == '+' || o == '-' || o == '/'  || o == '*') {
            System.out.print(a + " " + o+ " " + c + " = " );
            if(o == '+') System.out.println(a + c);
            else if(o == '-') System.out.println(a - c);
            else if(o == '/') System.out.println(a / c);
            else if(o == '*') System.out.println(a * c);
        }
        else {
            System.out.println("False");
        }
    }
}