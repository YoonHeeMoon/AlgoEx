import java.util.ArrayList;
import java.util.List;

public class Perblabla {
    public static void main(String[] args) {
        List<Integer> ls = new ArrayList<>();
        ls.add(1);
        ls.add(4);
        ls.add(3);
        ls.add(7);

        List<Integer> result = new ArrayList<>();

        int n = ls.size();
        int r = 3;
        p(ls, result, n, r);

    }

    static void p(List<Integer> ls, List<Integer> result, int n, int r) {
        if (r == 0) {
            System.out.println(result.toString());
            return;
        }
        for (int i = 0; i < n; i++) {
            result.add(ls.remove(i));
            p(ls,result,n-1,r-1);
            ls.add(i,result.remove(result.size()-1));
        }
    }
}
