package wrapper;

public class Integer01 {
    public static void main(String[] args) {
        // 演示int <--> Integer的装箱和拆箱
        // jdk5前是手动装箱和拆箱
        // 手动装箱 int -> Integer
        int n1 = 10;
        Integer integer = new Integer(n1);
        Integer integer1 = Integer.valueOf(n1);

        // 手动拆箱 Integer -> int
        int i = integer.intValue();

        // jdk5后就可以自动装箱和自动拆箱
        // 自动装箱
        int n2 = 20;
        Integer integer2 = n2; // 底层使用的是Integer.valueOf(n2)
        // 自动拆箱
        int n3 = integer2; // 底层使用的是integer2.intValue();
    }
}
