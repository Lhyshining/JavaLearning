package object;

public class Main {
    public static void main(String[] args) {
        Student student = new Student();
        student.name = "xm";
        student.say();
        // student.id = 123; // 属性私有
        int id = 10;
        student.setId(id);
        System.out.println(student.getId());
        System.out.println("=================");
        // Post Graduate
        // 一个对象的实际类型是确定的 new Student(); new PostGraduate();

        PostGraduate postGraduate = new PostGraduate();
        postGraduate.sayName("name");
        System.out.println("=================");
        // 方法重写
        postGraduate.test();
        postGraduate.sonMethod();
        // 父类的引用指向子类对象
        Student postGraduate1 = new PostGraduate();
        postGraduate1.test();
        // 未在父类声明方法，需要进行类型转换
        ((PostGraduate) postGraduate1).sonMethod();
        Object pg2 = new PostGraduate();
        ((PostGraduate) pg2).sonMethod();
        System.out.println("=================");
    }
}
