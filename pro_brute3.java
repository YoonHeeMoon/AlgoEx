import java.util.List;
import java.util.ArrayList;

public class pro_brute3 {
    public static List<Integer> all;

    public static void main(String[] args) {
        String numbers = "011";
        List<Character> arr = new ArrayList<>();
        List<Character> result = new ArrayList<>();
        for (int j = 0; j < numbers.length(); j++) {
            arr.add(numbers.charAt(j));
        }
        int n = numbers.length();

        all = new ArrayList<>();
        for (int r = 1; r <= n; r++) {
            p(arr, result, n, r, all);
        }

        System.out.println(all.toString());
        //return all.size();

    }

    public static void p(List<Character> arr, List<Character> result, int n, int r, List<Integer> all) {
        if (r == 0) {
            String s = "";
            for (int i = 0; i < result.size(); i++) {
                s += result.get(i);
            }
            int si = Integer.parseInt(s);

            if (isPrime(si) && !all.contains(si)) {
                all.add(si);

            }
            return;
        }
        for (int i = 0; i < n; i++) {
            result.add(arr.remove(i));
            p(arr, result, n - 1, r - 1, all);
            arr.add(i, result.remove(result.size() - 1));
        }
    }

    public static boolean isPrime(int i) {
        if (i == 2) {
            return true;
        }
        if (i == 1 || i % 2 == 0) {
            return false;
        }
        int sqrt = (int) Math.sqrt(i);
        for (int j = 3; j <= sqrt; j += 2) {
            if (i % j == 0) {
                return false;
            }
        }
        return true;
    }
}
