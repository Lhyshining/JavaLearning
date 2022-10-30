package exception;

public class Test {
    public static void main(String[] args) {
        int a = 1;
        int b = 0;

        try { // 监控区域
            System.out.println(a / b);
        } catch (ArithmeticException e) { // 捕获异常
            System.out.println("error");
        } finally { // 处理善后工作
            System.out.println("finally");
        }

        try {
            if (b == 0) {
                throw new ArithmeticException(); // 主动抛出
            }
        } catch (ArithmeticException e) {
            System.out.println("被动抛出");
        }

        try {
            new Test().a();
        } catch (Error e) {
            System.out.println("func error");
        } catch (Exception e) {
            System.out.println("func Exception");
        } catch (Throwable e) {
            System.out.println("func Throwable");
        } finally {
            System.out.println("finally");
        }


    }

    public void a() {
        b();
    }

    public void b() {
        a();
    }
}
