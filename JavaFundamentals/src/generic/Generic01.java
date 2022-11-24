package generic;

import java.util.ArrayList;

public class Generic01 {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        Person<Integer> person = new Person<Integer>(1);
    }
}

class Person<E> {
    private E s;

    public Person(E s) {
        this.s = s;
    }

    public E getS() {
        return s;
    }

    public void setS(E s) {
        this.s = s;
    }
}