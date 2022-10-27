package method;

public class Recursion {
    public static void main(String[] args) {
        int val = 3;
        int sum = 0;
        sum = factorial(val);
        System.out.println(sum);
    }

    // 递归求阶乘
    public static int factorial(int val) {
        if (val == 1){
            return 1;
        } else {
            return val * factorial(val - 1);
        }
    }
}
