import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.Array;
import java.util.*;

public class Main {
    static class Event{
        int x;
        int delta;
        Event(int x, int delta) {this.x = x; this.delta = delta;}
    }

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        List<Event> events = new ArrayList<>();

        int cur = 0;
        for(int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int dist = Integer.parseInt(st.nextToken());
            char dir = st.nextToken().charAt(0);
            int next = (dir == 'L') ? cur - dist : cur + dist;

            int a = Math.min(cur,next);
            int b = Math.max(cur,next);

            events.add(new Event(a, +1));
            events.add(new Event(b, -1));

             cur = next;
        }

        // 이벤트 정렬 (좌표 오름차순)
        events.sort((e1, e2) -> e1.x - e2.x);

        int ans = 0;
        int active = 0;
        int prevX = events.get(0).x;

        int i = 0;
        while (i < events.size()) {
            int x = events.get(i).x;

            // prevX ~ x 구간은 active번 겹침
            if (active >= 2) ans += (x - prevX);

            // 같은 좌표의 이벤트들을 한꺼번에 반영
            while (i < events.size() && events.get(i).x == x) {
                active += events.get(i).delta;
                i++;
            }

            prevX = x;
        }

        System.out.println(ans);
    }
}