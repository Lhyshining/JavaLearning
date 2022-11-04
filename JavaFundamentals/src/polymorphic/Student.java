package polymorphic;

public class Student extends Person{
    private int grade;

    public Student(String name, int age, int grade) {
        super(name, age);
        this.grade = grade;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    @Override
    public String say() {
        return super.say() + " " +this.grade;
    }

    public void study() {
        System.out.println(getName() + " is studying" );
    }
}
