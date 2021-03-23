public class test {
    public static void main(String[] args) {
        String t = "test2";
        int Index = t.indexOf("t2");
        
        System.out.println(t.substring(0,Index) + t.substring(Index+"t2".length()));

    }
}
