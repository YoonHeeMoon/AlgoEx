import java.util.ArrayList;
import java.util.Arrays;

public class pro_stq3 {
    public static void main(String[] args) {
        int[] progresses = {93,30,55};
        int[] speeds = {1,30,5};

        ArrayList<Integer> ls = new ArrayList<>();

        int node = 0;
        int count = 0;

        while(true){
            System.out.println(Arrays.toString(progresses));
            for(int i = node; i<progresses.length; i++){
                progresses[i] += speeds[i];

                if(progresses[i]>=100){
                    progresses[i] = 100;
                    speeds[i] = 0;
                }
            }
            if(progresses[node]>=100){
                for(int i = node; i<progresses.length; i++){
                    if(progresses[i]>=100){
                        count ++;
                        progresses[i] =0;
                    }else{
                        node = i;
                        break;
                    }
                }
                ls.add(count);
                count = 0;
            }
            if(progresses[progresses.length-1] ==0 ){
                break;
            }
        }
        int[] ans = new int[ls.size()];
        for (int i = 0; i < ans.length; i++) {
            ans[i] = ls.get(i);
        }
        
    }
}
