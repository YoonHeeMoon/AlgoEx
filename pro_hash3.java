import java.util.HashMap;

public class pro_hash3 {
    public static void main(String[] args) {
        String[][] clothes = { { "yellowhat", "headgear" }, { "bluesunglasses", "eyewear" },
                { "green_turban", "headgear" } };

        HashMap<String, Integer> map = new HashMap<>();

        for (int i = 0; i < clothes.length; i++) {
            Integer k = map.get(clothes[i][1]);
            if (k == null) {
                map.put(clothes[i][1], 1);
            } else {
                map.put(clothes[i][1], k + 1);
            }
        }

        int ans = 1;
        for (String key : map.keySet()) {
            ans *= map.get(key) + 1;
        }
        System.out.println(ans - 1);

    }
}
