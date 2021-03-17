import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

// 백준 1697 숨바꼭질
public class bj1697_soom {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int K = sc.nextInt();
        int target = sc.nextInt();

        Queue<Integer> q = new LinkedList<Integer>();

        boolean[] visited = new boolean[100001];
        int time = 0;
        q.add(K);
        visited[K] = true;
        q.add(time);

        while (!q.isEmpty()) {
            int c = q.poll();
            time = q.poll();

            if (target == c) {
                break;
            } else {
                if (c - 1 >= 0 && !visited[c - 1]) {
                    q.add(c - 1);
                    visited[c - 1] = true;
                    q.add(time+1);
                }
                if (c + 1 <= 100000 && !visited[c + 1]) {
                    q.add(c + 1);
                    visited[c + 1] = true;
                    q.add(time+1);
                }
                if (c * 2 <= 100000 && !visited[c * 2]) {
                    q.add(c * 2);
                    visited[c * 2] = true;
                    q.add(time+1);
                }
            }

        }
        System.out.println(time);
    }
}
