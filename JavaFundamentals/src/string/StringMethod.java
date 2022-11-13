package string;

public class StringMethod {
    public static void main(String[] args) {
        // 1.equals(),比较内容是否相同，区分大小写
        String str1 = "hello";
        String str2 = "Hello";
        System.out.println(str1.equals(str2));

        // equalsIgnoreCase() 忽略大小写
        System.out.println(str1.equalsIgnoreCase(str2));

        // length()
        System.out.println(str1.length());

        // indexOf() 返回字符在字符串对象中第一次出现的索引
        System.out.println(str1.indexOf("l"));

        // lastIndexOf
        System.out.println(str1.lastIndexOf("l"));

        // substring 截取指定范围的字符串，左闭右开,单个int从int开始往后截取
        System.out.println(str1.substring(1, 3));
        System.out.println(str1.substring(2));

        // toUpperCase
        System.out.println(str1.toUpperCase());

        // toLowerCase
        System.out.println(str1.toLowerCase());

        // concat 拼接字符串
        // str2.concat("world")并不会对str2产生影响，所以需要接收返回对象
        str2 = str2.concat("wor").concat("ld");
        System.out.println(str2);

        // replace 替换字符串中的字符串
        // str2.replace("x", "a");不会对str2产生影响
        str2 = str2.replace("world", "java");
        System.out.println(str2);

        // split 以逗号为标准对字符串分割
        String str3 = "abc,def,ghi";
        String[] split = str3.split(",");
        for (String s : split) {
            System.out.println(s);
        }

        // toCharArray
        str3 = "happy";
        char[] chs = str3.toCharArray();
        for (char c : chs) {
            System.out.println(c);
        }

        //compareTo()比较两个字符串大小，前者大返回正数，后者大返回负数，相等为0
        System.out.println(str1 + " " + str2);
        System.out.println(str1.compareTo(str2));

        // format 格式化字符串
        // %s 字符串，%c 字符， %d整型， %.2f浮点型
        String name = "mark";
        int age = 20;
        int score = 88;
        String info = String.format("姓名%s，年龄%d，分数%d", name, age, score);
        System.out.println(info);
        System.out.println("姓名" + name + "年龄" + age + "分数" + score);

        //
    }
}
