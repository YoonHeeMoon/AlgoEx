import java.util.ArrayList;
import java.util.HashMap;

public class pro_hash4 {
    public static void main(String[] args) {

        String[] genres = { "classic", "pop", "classic", "city", "pop" };
        int[] plays = { 800, 1000, 800, 2200, 300 };

        ArrayList<Integer> list = new ArrayList<Integer>();
        int[] ret = {};

        HashMap<String, Integer> map = new HashMap<String, Integer>();

        for (int i = 0; i < plays.length; i++) {
            Integer k = map.get(genres[i]);
            if (k == null) {
                map.put(genres[i], plays[i]);
            } else {
                map.put(genres[i], k + plays[i]);
            }
        }

        while (!map.isEmpty()) {

            int max = 0;
            String maxKey = "";

            for (String key : map.keySet()) {
                int a = map.get(key);
                if (max < a) {
                    max = a;
                    maxKey = key;
                }
            }
            map.remove(maxKey);

            max = 0;
            int maxIndex = 0;
            for (int i = 0; i < genres.length; i++) {
                if (genres[i].equals(maxKey) && max < plays[i]) {
                    max = plays[i];
                    maxIndex = i;
                }
            }
            plays[maxIndex] = 0;
            list.add(maxIndex);

            max = 0;
            maxIndex = 0;
            for (int i = 0; i < genres.length; i++) {
                if (genres[i].equals(maxKey) && max < plays[i]) {
                    max = plays[i];
                    maxIndex = i;
                }
            }
            if (max == 0) {
                continue;
            }
            plays[maxIndex] = 0;
            list.add(maxIndex);
        }

        ret = new int[list.size()];
        for (int i = 0; i < ret.length; i++) {
            ret[i] = list.get(i);
        }

        for (int i = 0; i < ret.length; i++) {
            System.out.println(ret[i]);
        }

    }
}
