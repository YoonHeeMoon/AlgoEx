import java.util.Arrays;

public class pro_brute3 {
    public static void main(String[] args) {
        int brown = 16;
        int yellow = 9;
        
        int[] answer = new int[2];

        int a = brown + yellow;
        int sqrt = (int)Math.sqrt(a);
        
        for (int i = 1; i <= sqrt; i++) {
            if(a % i == 0){
                int j = a / i;
                int k = (j-2) * (i-2);

                if(k == yellow){
                    answer[0]=j;
                    answer[1]=i;
                    break;
                }
            }
        }
        System.out.println(Arrays.toString(answer));
        //return answer;
    }
}
