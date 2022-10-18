package base;

public class Variable {
    // 类变量 static
    static double salary = 100;

    // 常量
    static final double PI = 3.14;

    // 实例变量
    String name; // 默认null
    int age; // 默认0

    public static void main(String[] args) {
        // 局部变量
        int i = 10;
        System.out.println(i);
        Variable variable = new Variable();
        System.out.println(variable.age);
        System.out.println(variable.name);
        System.out.println(salary);
        System.out.println(PI);
    }
}
