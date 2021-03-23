import java.util.LinkedList;
import java.util.Queue;

public class pro_stq1 {
    public static void main(String[] args) {
        int bridge_length = 100;
        int weight = 100;
        int[] truck_weights = {10,10,10,10,10,10,10,10,10,10};


        int[] trucks = new int[truck_weights.length+1];
        for (int i = 0; i < truck_weights.length; i++) {
            trucks[i] = truck_weights[i];
        }
        trucks[truck_weights.length] = 10001;

        Queue<Integer> q = new LinkedList<>();
        int time = 0;
        int i = 0;
        q.offer(time+bridge_length);
        q.offer(trucks[i]);
        weight -= trucks[i];
        i++;

        while(true){
            System.out.println(q.toString());
            time++;
            if(q.peek()==time){
                q.poll();
                weight += q.poll();
            }
            if(weight >= trucks[i]){
                q.offer(time+bridge_length);
                q.offer(trucks[i]);
                weight -= trucks[i];
                i++;
            }
            if(i == trucks.length-1 && q.isEmpty()){
                break;
            }      
            if(q.peek()==time){
                q.poll();
                weight += q.poll();
            }
            
        }
        System.out.println(time+1);
    }
}
