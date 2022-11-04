package object;

public class ClassVariable {
    public static void main(String[] args) {
        Child child1 = new Child();
        child1.count++;
        Child child2 = new Child();
        child2.count++;
        Child child3 = new Child();
        child3.count++;
        System.out.println(Child.count); // 3
    }
}

class Child {
    public static int count = 0;
}