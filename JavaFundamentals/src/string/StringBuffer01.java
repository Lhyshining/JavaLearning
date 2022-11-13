package string;

public class StringBuffer01 {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("hello");
        String str = "nihao";
        // String -> StringBuffer
        // 1.
        StringBuffer sb1 = new StringBuffer(str); // 对str本身没有影响
        // 2.
        StringBuffer sb2 = new StringBuffer();
        sb2.append(str);
        System.out.println(sb2);

        // StringBuffer -> String
        // 1.
        String str1 = sb2.toString();
        // 2.
        String str2 = new String(sb2);
    }
}
