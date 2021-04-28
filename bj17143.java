import java.util.Scanner;

public class bj17143 {
    public static class shark {
        public int s = 0;
        public int d = 0;
        public int z = 0;

        public String toString() {
            String ret = "" + s + d + z;
            return ret;
        }
    }

    static shark[][] map;
    static int R;
    static int C;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        R = sc.nextInt();
        C = sc.nextInt();
        map = new shark[R][C];
        int M = sc.nextInt();

        for (int i = 0; i < R; i++) {
            for (int j = 0; j < C; j++) {
                map[i][j] = new shark();
            }
        }

        for (int i = 0; i < M; i++) {
            int r = sc.nextInt() - 1;
            int c = sc.nextInt() - 1;
            map[r][c].s = sc.nextInt();
            map[r][c].d = sc.nextInt();
            map[r][c].z = sc.nextInt();
        }
        for (int i = 0; i < R; i++) {
            for (int j = 0; j < C; j++) {
                System.out.print(map[i][j] + " ");
            }
            System.out.println();
        }
        int fisher = -1;
        int ans = 0;
        while (true) {
            fisher++;
            for (int i = 0; i < R; i++) {
                if (!map[i][fisher].equals("000")) {
                    ans += map[i][fisher].z;
                    map[i][fisher] = new shark();
                    break;
                }
            }
            sharkMove();

        }
    }

    static void sharkMove() {
        int[][] dir = { { 0, 0 }, { -1, 0 }, { 1, 0 }, { 0, 1 }, { 1, 0 } };
        for (int i = 0; i < R; i++) {
            for (int j = 0; j < C; j++) {
                if (!map[i][j].equals("000")) {
                    if (map[i][j].d == 1 || map[i][j].d == 2) {
                        int s = map[i][j].s % R;
                        while(s >= 0){
                            
                        }
                    } else {

                    }
                }
            }
        }
    }
}