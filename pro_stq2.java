import java.util.Stack;

public class pro_stq2 {
    public static void main(String[] args) {
        int[] prices = {1,2,3,2,3};

        Stack<Integer> beginIdxs = new Stack<>();
        int i=0;

        int[] terms = new int[prices.length];

        beginIdxs.push(i);
        for (i=1; i<prices.length; i++) {
            System.out.println(beginIdxs.toString());
            while (!beginIdxs.empty() && prices[i] < prices[beginIdxs.peek()]) {
                int beginIdx = beginIdxs.pop();
                terms[beginIdx] = i - beginIdx;
            }
            beginIdxs.push(i);
        }
        while (!beginIdxs.empty()) {
            int beginIdx = beginIdxs.pop();
            terms[beginIdx] = i - beginIdx - 1;
        }
    }
}
