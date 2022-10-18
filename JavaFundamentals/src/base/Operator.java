package base;

public class Operator {
    public static void main(String[] args) {
        // 算术运算符+ - * / % ++ --
        // Ctrl + D复制当前行到下一行
        int a = 10;
        int b = 20;
        System.out.println(a / b); // 不进行转换int(0.5) -> 0
        System.out.println(a / (double) b);

        int c = a++; // c = 10, a = 11
        int d = ++a; // d = 12, a = 12
        a = ++a; // a = 13
        a = a++; // a = 13
        // Math
        double pow = Math.pow(2, 3); // 2^3
        System.out.println(pow);
        // && || !
        // & | ~ ^
        // += -= /= *=
        // a>b?a:b
        // 字符串拼接
        System.out.println(a + b + "");
        System.out.println("" + a + b);
    }
}
