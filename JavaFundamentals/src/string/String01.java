package string;

public class String01 {
    public static void main(String[] args) {
        //
        String str1 = "mark";
        String str2 = new String("mark");
        System.out.println(str1 + str2);
        System.out.println(str1 == str2.intern());
        System.out.println(str2 == str2.intern());

    }
}
