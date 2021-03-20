public class pro_dfs2 {
static int networks = 0;
static boolean visited[];
    public static void main(String[] args) {
        int n = 3;
        int[][] computers = {{1,1,0},{1,1,1},{0,1,1}};
        visited = new boolean[n];

        for (int i = 0; i < visited.length; i++) {
            if(!visited[i]){
                visited[i]=true;
                dfs(computers,i);
                networks++;
            }
        }

        System.out.println(networks);
    }
    static void dfs(int[][] computers, int node){
        for (int i = 0; i < visited.length; i++) {
            if(!visited[i] && computers[node][i] == 1){
                visited[i] = true;
                dfs(computers, i);
            }
        }
    }
}
