import java.util.Stack;

public class pro_dfs2_stack {
    public static void main(String[] args) {
        int n = 3;
        int[][] computers = {{1,0,0},{0,1,0},{0,0,1}};
        
        boolean[] visited = new boolean[n];
        Stack<Integer> st = new Stack<>();
        int networks = 0;

        for (int i = 0; i < visited.length; i++) {
            
            if(!visited[i]){
                visited[i] = true;
                st.add(i);
                networks++;

                while(!st.empty()){
                    int node = st.pop();
                    for (int j = 0; j < visited.length; j++) {
                        if(!visited[j] && computers[node][j] == 1){
                            visited[j] = true;
                            st.add(j);
                        }
                    }
                }
            }
            
        }
        

        System.out.println(networks);
    }
}
