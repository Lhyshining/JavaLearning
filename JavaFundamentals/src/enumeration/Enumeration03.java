package enumeration;

public class Enumeration03 {
    public static void main(String[] args) {
        System.out.println(Season3.SPRING);
    }
}
// 用enum来实现枚举类
// 1. 使用关键字enum替代class
// 2. public static final Season3 SPRING = new Season3("春天", "温暖"); 直接使用
//      SPRING("春天", "温暖");
// 3. 如果有多个常量对象，使用逗号隔离
// 4. 如果使用enum来实现枚举，要求将定义常量对象写在前面
// 5. 如果使用无参构造器，创建常量对象可以省略括号

enum Season3 {
    SPRING("春天", "温暖"), SUMMER("夏天", "炎热"), AUTUMN("秋天", "凉爽"), WINTER("冬天", "寒冷");
    private String name;
    private String desc;

//    public static final Season3 SPRING = new Season3("春天", "温暖");
//    public static final Season3 SUMMER = new Season3("夏天", "炎热");
//    public static final Season3 AUTUMN = new Season3("秋天", "凉爽");
//    public static final Season3 WINTER = new Season3("冬天", "寒冷");


    private Season3(String name, String desc) {
        this.name = name;
        this.desc = desc;
    }

    public String getName() {
        return name;
    }

    public String getDesc() {
        return desc;
    }

    @Override
    public String toString() {
        return "Season3{" +
                "name='" + name + '\'' +
                ", desc='" + desc + '\'' +
                '}';
    }
}

