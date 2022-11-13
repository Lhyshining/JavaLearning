package string;

public class StringBufferMethod {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("hello");

        // 增
        sb.append(",world");
        System.out.println(sb);

        // 删,左闭右开[左，右)
        // hello,world
        // 012345678910
        sb.delete(10,11);
        System.out.println(sb);

        sb.replace(9,10,"d");
        System.out.println(sb);

        System.out.println(sb.indexOf("l"));

        // 在9处插入l，9处内容后移
        sb.insert(9,"l");
        System.out.println(sb);

        System.out.println(sb.length());
    }
}
