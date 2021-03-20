import java.util.LinkedList;
import java.util.Queue;

public class pro_bfs {
    public static void main(String[] args) {
        String begin = "hit";
        String target = "cog";
        String[] words = {"hot", "dot", "dog", "lot", "log", "cog"};

        int answer = 0;

        int size = words.length;
        boolean[] visited = new boolean[size];
        Queue<String> q = new LinkedList<>();

        q.add(0 + begin);
        while(!q.isEmpty()){
            String tmp = q.poll();
            System.out.println(tmp);
            int time = Integer.parseInt(tmp.substring(0,1));
            String s = tmp.substring(1);
            if(s.equals(target)){
                answer = time;
                break;
            }
            
            for (int j = 0; j < visited.length; j++) {
                if(!visited[j]){
                    boolean next =false;
                    for (int i = 0; i < s.length(); i++) {
                        if(words[j].substring(0, i).equals(s.substring(0, i)) && words[j].substring(i+1).equals(s.substring(i+1))){
                            next = true;
                            break;
                        }
                    }
                    if(next){
                        visited[j]=true;
                        q.add(time+1 + words[j]);
                    }
                }
            }
        }

        System.out.println(answer);
    }
}
