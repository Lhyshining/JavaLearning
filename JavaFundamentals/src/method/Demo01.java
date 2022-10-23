package method;

public class Demo01 {
    public static void main(String[] args) {
        for (int i = 0; i < args.length; i++) {
            System.out.println("args[" + i + "]: " + args[i]);
        }
        int i1 = 10;
        int i2 = 20;
        int i3 = myAdd(i1, i2);
        System.out.println("sum:" + i3);
        System.out.println("max:" + myMax(i1, i2));
    }

    public static int myAdd(int a, int b) {
        return a + b;
    }

    public static int myMax(int a, int b) {
        return a > b ? a : b;
    }

    // 重载
    public static double myMax(double a, double b) {
        return a > b ? a : b;
    }
}
