package object;

public class Student {
    // 属性
    String name = "Student";
    int age;
    private int id;
    protected double grade;

    // 方法
    public void say() {
        System.out.println(this.name + " is a student.");
    }

    // 默认构造
    public Student(){
        this.age = -1;
    }

    // 有参构造
    public Student(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    // 方法重写
    public void test() {
        System.out.println("Student test");
    }


}
