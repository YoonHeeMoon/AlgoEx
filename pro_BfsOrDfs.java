import java.util.Arrays;
public class pro_BfsOrDfs {
    static String[] board;
    public static void main(String[] args) {
        String[][] tickets = { { "ICN", "SFO" }, { "ICN", "ATL" }, { "SFO", "ATL" }, { "ATL", "ICN" },
                { "ATL", "SFO" } };

        boolean[] visited = new boolean[tickets.length];
        String begin = "ICN";
        String[] ans = new String[tickets.length + 1];
        board = new String[tickets.length + 1];
        ans[0] = begin;

        dfs(tickets, visited, begin, ans, 1, tickets.length);

        System.out.println(Arrays.toString(board));
    }

    static void dfs(String[][] tickets, boolean[] visited, String begin, String[] ans, int depth, int end) {
        if (depth == end + 1) {
            if(board == null){
                for (int i = 0; i < ans.length; i++) {
                    board[i] = ans[i];
                }
            }else{
                if(Arrays.toString(board).compareTo(Arrays.toString(ans))>0){
                    for (int i = 0; i < ans.length; i++) {
                        board[i] = ans[i];
                    }
                }
            }
            System.out.println(Arrays.toString(ans));
            return;
        }
        for (int i = 0; i < end; i++) {
            if (!visited[i] && tickets[i][0].equals(begin)) {
                visited[i] = true;
                ans[depth] = tickets[i][1];
                dfs(tickets, visited, tickets[i][1], ans, depth + 1, end);
                visited[i] = false;
            }
        }
    }
}
