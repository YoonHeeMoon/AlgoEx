import java.util.Arrays;

public class pro_hash2 {
    public static void main(String[] args) {
        String[] phone_book = { "1", "234", "543", "567","577","587","556","56778", "8" };

        Arrays.sort(phone_book);

        for (int i = 0; i < phone_book.length -1; i++) {
             if(phone_book[i+1].indexOf(phone_book[i]) == 0){
                 System.out.println(true);
             }
        }


      

    }
}
