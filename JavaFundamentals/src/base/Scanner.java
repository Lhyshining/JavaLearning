package base;

public class Scanner {
    // scanner测试
    public static void ScannerTest() {
        // Scanner对象
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        System.out.println("next方式接收");
        // 判断用户有没有输入字符串
        if (scanner.hasNext()) {
            // 使用next方法接收,不能接收空格
            String str = scanner.next();
            System.out.println("接收的内容为：" + str);
        }
        // 凡是属于io流的类如果不关闭会一直占用资源
        scanner.close();
    }

    // scanner测试2
    public static void ScannerTest2() {
        // Scanner对象
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        System.out.println("nextLine方式接收");
        if (scanner.hasNextLine()) {
            // 使用nextLine方法接收，可以接收空格
            String str = scanner.nextLine();
            System.out.println("接收的内容为：" + str);
        }
        // 凡是属于io流的类如果不关闭会一直占用资源
        scanner.close();
    }

    // scanner整数测试3
    public static void ScannerTest3() {
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        int i = 0;
        float f = 0.0f;
        System.out.println("请输入整数：");
        if (scanner.hasNextInt()) {
            i = scanner.nextInt();
            System.out.println("接收的整数为：" + i);
        } else {
            System.out.println("你输入的不是整数数据");
        }
        scanner.close();
    }

    public static void main(String[] args) {
//        ScannerTest();
//        ScannerTest2();
        ScannerTest3();
    }
}
