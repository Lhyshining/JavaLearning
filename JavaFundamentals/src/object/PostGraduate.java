package object;

public class PostGraduate extends Student {
    private String name = "PostGraduate";

    public void sayName(String name) {
        System.out.println(name);   // 调用形参
        System.out.println(this.name);  // 调用该类
        System.out.println(super.name); // 调用父类
    }

    @Override
    public void test() {
        System.out.println("Postgraduate test");
    }

    public void sonMethod() {
        System.out.println("只在子类声明");
    }
}
