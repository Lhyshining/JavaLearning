package collection.collection.list;

import java.util.Vector;

public class VectorMethod {
    public static void main(String[] args) {
        Vector vector = new Vector();
        for (int i = 0; i < 10; i++) {
            vector.add(i);
        }
        System.out.println(vector);
    }
}
