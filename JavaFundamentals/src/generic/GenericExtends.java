package generic;

import java.util.ArrayList;
import java.util.List;

public class GenericExtends {
    public static void main(String[] args) {
        Object o = new String("john");
//        List<Object> list = new ArrayList<String>(); // error
        ArrayList<Object> list1 = new ArrayList<>();
        ArrayList<String> list2 = new ArrayList<>();
        ArrayList<A> list3 = new ArrayList<>();
        ArrayList<B> list4 = new ArrayList<>();
        ArrayList<C> list5 = new ArrayList<>();

        printCollection1(list1); // 任意list
        printCollection2(list4); // 只能接受B和B的子类 list4 list5
        printCollection3(list1); // 只能B和B的父类 String不算 list1 list3 list 4

    }

    public static void printCollection1(List<?> c) {
        for (Object o : c) {
            System.out.println(o);
        }
    }

    public static void printCollection2(List<? extends B> c) {
        for (Object o : c) {
            System.out.println(o);
        }
    }

    public static void printCollection3(List<? super B> c) {
        for (Object o : c) {
            System.out.println(c);
        }
    }
}

class A {

}

class B extends A {

}

class C extends B {

}