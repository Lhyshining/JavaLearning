package collection.map;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

public class MapExercise {
    public static void main(String[] args) {
        // 使用HashMap添加3个员工对象
        // key:id value:员工对象
        // 并遍历显示工资>18000的员工
        // 员工类：name salary id
        HashMap hashMap = new HashMap();
        Employee mark = new Employee("mark", 17900, 1);
        Employee john = new Employee("john", 19100, 2);
        Employee marry = new Employee("marry", 19200, 3);
        hashMap.put(mark.getId(), mark);
        hashMap.put(john.getId(), john);
        hashMap.put(marry.getId(), marry);

        // 1.
        System.out.println("---------------");
        Set entrySet = hashMap.entrySet();
        for (Object o : entrySet) {
            Map.Entry entry = (Map.Entry) o;
            Employee employee = (Employee) entry.getValue();
            if (employee.getSalary() > 18000) {
                System.out.println(employee);
            }
        }
        // 2.
        System.out.println("---------------");
        Set keySet = hashMap.keySet();
        for (Object key : keySet) {
            Object value = hashMap.get(key);
            Employee employee = (Employee) value;
            if (employee.getSalary() > 18000) {
                System.out.println(employee);
            }
        }


    }
}

class Employee {
    private String name;
    private int salary;
    private int id;

    public Employee(String name, int salary, int id) {
        this.name = name;
        this.salary = salary;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                ", id=" + id +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return salary == employee.salary && id == employee.id && Objects.equals(name, employee.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, salary, id);
    }
}
