package polymorphic;

public class PolyArray {
    public static void main(String[] args) {
        Person[] persons = new Person[5];
        persons[0] = new Person("jack", 20);
        persons[1] = new Student("xiaoming", 14, 88);
        persons[2] = new Student("xiaohong", 13, 90);
        persons[3] = new Teacher("mrwang", 55, 6000);
        persons[4] = new Teacher("missliu", 30, 6100);
        for (Person i : persons) {
            // 编译类型是Person， 运行类型看右边
            System.out.println(i.say()); // 动态绑定机制
        }
    }
}
