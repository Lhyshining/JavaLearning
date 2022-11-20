package collection.collection.set;

import java.util.HashSet;
import java.util.Objects;

public class HashSetExercise {
    public static void main(String[] args) {
        // 创建3个Employee类，该类包括：private成员属性name，age
        // 当name和age的值相同时，认为是相同员工，不能添加到HashSet集合中
        HashSet hashSet = new HashSet();
        hashSet.add(new Employee("john",25));
        hashSet.add(new Employee("john",24));
        hashSet.add(new Employee("john",25));
        System.out.println(hashSet);
    }
}

class Employee {
    private String name;
    private int age;

    public Employee(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return age == employee.age && Objects.equals(name, employee.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

}

