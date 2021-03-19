import java.util.Arrays;
import java.util.Comparator;

public class pro_sort2 {
    public static void main(String[] args) {
        int[] numbers = { 595, 54, 5 };
        String answer = "";
        String[] numStr = new String[numbers.length];

        for (int i = 0; i < numStr.length; i++) {
            numStr[i]=Integer.toString(numbers[i]);
        }
        Comparator<String> c = new Comparator<String>() {
            public int compare(String s1, String s2) {

                return ((s2 + s1).compareTo(s1 + s2));
            }
        };
        Arrays.sort(numStr , c);

        if(numStr[0].equals("0")){
            //return "0";
        }
        for (int i = 0; i < numStr.length; i++) {
            answer += numStr[i];
        }
        //return answer;
    }
}
