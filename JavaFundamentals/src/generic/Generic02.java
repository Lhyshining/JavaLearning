package generic;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Generic02 {
    public static void main(String[] args) {
        HashMap<String, Student> map = new HashMap<>();
        map.put("mark", new Student("mark", 18));
        map.put("marry", new Student("marry", 19));
        map.put("jack", new Student("jack", 17));

        // 遍历
        Set<Map.Entry<String, Student>> entries = map.entrySet();
        for (Map.Entry<String, Student> o : entries) {
            String key = o.getKey();
            Student student = o.getValue();
            System.out.println(key + " " + student);
        }
        // iterator
        Iterator<Map.Entry<String, Student>> iterator = map.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<String, Student> next = iterator.next();
            System.out.println(next.getKey() + " " + next.getValue());
        }

    }
}

class Student {
    private String name;
    private int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}