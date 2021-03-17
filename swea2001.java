import java.util.Scanner;

public class swea2001 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int t = 1; t <= T; t++) {
            int N = sc.nextInt();
            int M = sc.nextInt();

            int[][] map = new int[N][N];
            for (int i = 0; i < N; i++) {
                for (int j = 0; j < N; j++) {
                    map[i][j] = sc.nextInt();
                }
            }
            int max = 0;
            for (int i = 0; i < N - M + 1; i++) {
                for (int j = 0; j < N - M + 1; j++) {
                    int k = 0;
                    for (int i1 = 0; i1 < M; i1++) {
                        for (int j1 = 0; j1 < M; j1++) {
                            k += map[i + i1][j + j1];
                        }
                    }
                    if(max < k){
                        max = k;
                    }
                }
            }

            System.out.println("#" + t + " " + max);
        }
    }

}
