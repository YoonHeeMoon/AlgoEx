public class pro_dfs1 {
    static int answer= 0 ;
    public static void main(String[] args) {
        int[] numbers = {1,1,1,1,1};
        
        int target = 3;

        dfs(numbers, 0, 0 , target,numbers.length);
        System.out.println(answer);
    }
    public static void dfs(int[] numbers,int depth, int sum, int target, int end){
        if(depth == end){
            if(target == sum){
                answer++;
            }
            return;
        }
        dfs(numbers, depth +1 , sum + numbers[depth], target, end);
        dfs(numbers, depth +1 , sum - numbers[depth], target, end);
    }
}
