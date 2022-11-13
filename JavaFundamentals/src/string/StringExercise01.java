package string;

public class StringExercise01 {
    String str = new String("mark");
    final char[] ch = {'j', 'a', 'v', 'a'};
    public void change(String str, char ch[]) {
        str = "java";
//        this.str = "java";
        ch[0] = 'h';
    }

    public static void main(String[] args) {
        StringExercise01 stringExercise01 = new StringExercise01();
        stringExercise01.change(stringExercise01.str, stringExercise01.ch);
        System.out.println(stringExercise01.str); // mark
        System.out.println(stringExercise01.ch); // hava
    }
}

