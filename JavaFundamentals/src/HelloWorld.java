/**
 * @author lhy
 *
 */
public class HelloWorld {
    public static void main(String[] args) {
        // 数据类型部分
        byte num1 = 10;
        long num2 = 10L;
        boolean num3 = false;
        float num4 = 50.1F;
        // 二进制0b 十进制 八进制0 十六进制0x
        int i1 = 0b10;
        int i2 = 10;
        int i3 = 010;
        int i4 = 0x10;
        System.out.println(i1);
        System.out.println(i2);
        System.out.println(i3);
        System.out.println(i4);

        // 浮点数测试
        System.out.println("=======================");
        float f1 = 0.1f;
        double d1 = 1 / 10;
        System.out.println(f1 == d1); // 永远为false
        float f2 = 123123123213213123f;
        float f3 = f2 + 1;
        System.out.println(f2 == f3); // true

        // 字符串测试
        System.out.println("=======================");
        char c1 = 'a';
        char c2 = '中';
        System.out.println(c1);
        System.out.println((int)c1); // 强制转换为unicode
        System.out.println(c2);
        System.out.println((int)c2);
        // unicode编码范围：U0000~UFFFF
        char c3 = '\u0061'; // 0x61 = 97
        System.out.println(c3);
        // 转义字符
        // \t 制表符
        // \n 换行
        System.out.println("Hello\tworld");

        // boolen测试
        System.out.println("=======================");
        boolean flag = true;
        if (flag){}

        // 强制类型转换
        int i = 128;
        byte b = (byte) i;
        double d = i;
    }
}
