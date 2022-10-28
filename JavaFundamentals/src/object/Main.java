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
        PostGraduate postGraduate = new PostGraduate();
        postGraduate.sayName("name");
        System.out.println("=================");
        postGraduate.test();
        Student postGraduate1 = new PostGraduate();
        postGraduate1.test();
    }
}
