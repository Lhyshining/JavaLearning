package wrapper;

public class WrapperVSString {
    public static void main(String[] args) {
        // 包装类 -> String
        Integer i = 100; // 自动装箱
        // 方式1
        String str1 = i + "";
        // 方式2
        String str2 = i.toString();
        // 方式3
        String str3 = String.valueOf(i);

        // String -> 包装类
        String str = "1234";
        // 方式1
        Integer i1 = Integer.valueOf(str);
        // 方式2
        Integer i2 = Integer.parseInt(str);
        // 方式3
        Integer i3 = new Integer(str);
    }
}
