package method;

public class VariableParameter {
    public static void main(String[] args) {
        myAdd(1, 2, 10);
    }

    // 可变参数
    public static void myAdd(int... i) {
        System.out.println(i[0]);
        System.out.println(i[1]);
        System.out.println(i[2]);
    }
}
