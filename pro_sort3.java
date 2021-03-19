import java.util.Arrays;
import java.util.Comparator;

public class pro_sort3 {
    public static void main(String[] args) {
        int[] citations = { 5,5,5,5,6,6,6 };

        int answer = 0;

        Arrays.sort(citations);
        System.out.println(Arrays.toString(citations));
        
        for (int h = citations.length; h >= 0  ; h--) {

            if(h == 0){
                answer = 0;
                break;
            }
            
            if(citations[citations.length - h ] < h){
                continue;
            } // 뒤에서 h번째 논문이 인용수가 h가 안되면 패스
            if(citations.length > h && citations[citations.length - h -1 ] > h){
                continue;
            } // 논문수가 h보다 많은데, h+1번쨰 논문이 h보다 크면 패스
            answer = h;
            break;
        }
        System.out.println(answer);
        
    }
}
