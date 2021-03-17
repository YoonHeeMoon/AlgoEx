import java.util.Scanner;

public class swea1986 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int t = 1; t <= T; t++) {
            int total = 0;
            int minus = 1;
            int K = sc.nextInt();
            for (int i = 1; i <= K; i++) {
                total += i * minus;
                minus *= -1;
            }
            System.out.println("#"+ t + " " + total);
        }
    }

}
