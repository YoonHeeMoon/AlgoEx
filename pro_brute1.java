import java.util.ArrayList;

public class pro_brute1 {
    public static void main(String[] args) {
        int[] answers = { 1,3,2,4,2,3,3,3,5,5 };

        int[][] boards = { { 1, 2, 3, 4, 5 }, { 2, 1, 2, 3, 2, 4, 2, 5 }, { 3, 3, 1, 1, 2, 2, 4, 4, 5, 5 } };
        int[] pointer = { 0, 0, 0 };
        int[] scores = new int[3];

        for (int i = 0; i < answers.length; i++) {
            int ans = answers[i];

            for (int j = 0; j < 3; j++) {
                if (boards[j][pointer[j]] == ans) {
                    scores[j]++;
                }
                pointer[j]++;
            }
            if (pointer[0] == 5) {
                pointer[0] = 0;
            }
            if (pointer[1] == 8) {
                pointer[1] = 0;
            }
            if (pointer[2] == 10) {
                pointer[2] = 0;
            }
        }
        ArrayList<Integer> ls = new ArrayList<>();

        int max = 0;
        int maxIndex = 0;

        for (int i = 0; i < 3; i++) {
            if (max < scores[i]) {
                max = scores[i];
                maxIndex = i;
            }
        }
        ls.add(maxIndex+1);
        scores[maxIndex] = 0;
        for (int i = 0; i < 3; i++) {
            if (max == scores[i]) {
                ls.add(i+1);
            }
        }
        System.out.println(ls.toString());

    }
}
