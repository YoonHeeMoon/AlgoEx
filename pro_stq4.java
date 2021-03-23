import java.util.LinkedList;
import java.util.Queue;

public class pro_stq4 {
    public static void main(String[] args) {
        int[] priorities = {1,1,9,1,1,1};
        int location = 0;

        int[] idxs = new int[priorities.length];
        for(int i = 0; i< idxs.length ; i++){
            idxs[i] = i;
        }

        Queue<Integer> q = new LinkedList<>();
        Queue<Integer> idx = new LinkedList<>();

        for(int i = 0 ; i < idxs.length ; i++){
            q.add(priorities[i]);
            idx.add(idxs[i]);
        }
        int count = 0;
        while(!q.isEmpty()){
            boolean next = false;
            int poll = q.poll();
            int inPoll = idx.poll();
            for(int i = 0; i < q.size() ; i++){
                for(int j = poll+1 ; j<= 9 ; j++){
                    if(q.contains(j)){
                        next =true;
                        break;
                    }
                }
                if(next){
                    break;
                }
            }
            if(next){
                q.add(poll);
                idx.add(inPoll);
                continue;
            }
            //print
            count++;
            if(location == inPoll){
                break;
            }
        }
        System.out.println(count);
    }
}
