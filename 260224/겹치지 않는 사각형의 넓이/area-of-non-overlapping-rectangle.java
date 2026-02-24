import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int ax1 = sc.nextInt();
        int ay1 = sc.nextInt();
        int ax2 = sc.nextInt();
        int ay2 = sc.nextInt();
        int bx1 = sc.nextInt();
        int by1 = sc.nextInt();
        int bx2 = sc.nextInt();
        int by2 = sc.nextInt();
        int mx1 = sc.nextInt();
        int my1 = sc.nextInt();
        int mx2 = sc.nextInt();
        int my2 = sc.nextInt();

        int res = area(ax1, ay1, ax2, ay2) + area(bx1, by1, bx2, by2);

        // 겹치는 부분 찾아 제거하기
        res -= count(ax1, ay1, ax2, ay2, mx1, my1, mx2, my2);
        res -= count(bx1, by1, bx2, by2, mx1, my1, mx2, my2);

        System.out.println(res);
    }

    static int area(int x1, int y1, int x2, int y2) {
        return Math.max(0, x2 - x1) * Math.max(0, y2 - y1);
    }

    static int count(int ax1, int ay1, int ax2, int ay2,
                      int bx1, int by1, int bx2, int by2) {
        int ix1 = Math.max(ax1, bx1);
        int iy1 = Math.max(ay1, by1);
        int ix2 = Math.min(ax2, bx2);
        int iy2 = Math.min(ay2, by2);

        return area(ix1, iy1, ix2, iy2);
    }
}