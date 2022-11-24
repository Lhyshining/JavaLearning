package generic;

import java.util.ArrayList;
import java.util.Comparator;

public class Generic03 {
    public static void main(String[] args) {
        ArrayList<Employee> employees = new ArrayList<>();
        employees.add(new Employee("mark", 7999, new MyDate(8, 30, 1997)));
        employees.add(new Employee("marry", 8999, new MyDate(7, 21, 1996)));
        employees.add(new Employee("mark", 6999, new MyDate(8, 29, 1997)));

        employees.sort(new Comparator<Employee>() {
            @Override
            public int compare(Employee e1, Employee e2) {
                int ans = e1.getName().compareTo(e2.getName());
                if (ans == 0) { // 年份小的在前，年龄大的在前
                    ans = e1.getBirthday().compareTo(e2.getBirthday());
                }
                return ans;
            }
        });
        System.out.println(employees);
    }
}

class MyDate implements Comparable<MyDate> {
    private int month;
    private int day;
    private int year;

    public MyDate(int month, int day, int year) {
        this.month = month;
        this.day = day;
        this.year = year;
    }

    // 重写compareTo
    @Override
    public int compareTo(MyDate o) {
        int ans = this.getYear() - o.getYear();
        if (ans == 0) {
            ans = this.getMonth() - o.getMonth();
            if (ans == 0) {
                ans = this.getDay() - o.getDay();
            }
        }
        return ans;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return "MyDate{" +
                "month=" + month +
                ", day=" + day +
                ", year=" + year +
                '}';
    }
}

class Employee {
    private String name;
    private int salary;
    private MyDate birthday;

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

    public MyDate getBirthday() {
        return birthday;
    }

    public void setBirthday(MyDate birthday) {
        this.birthday = birthday;
    }

    public Employee(String name, int salary, MyDate birthday) {
        this.name = name;
        this.salary = salary;
        this.birthday = birthday;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                ", birthday=" + birthday +
                '}' + '\n';
    }
}
