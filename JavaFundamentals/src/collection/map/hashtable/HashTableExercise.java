package collection.map.hashtable;

import java.util.Hashtable;

public class HashTableExercise {
    public static void main(String[] args) {
        Hashtable hashtable = new Hashtable();
        hashtable.put(1, "john");
//        hashtable.put(null,"john"); // error
//        hashtable.put(2,null); // error
        hashtable.put(1, "mark");
        System.out.println(hashtable);

    }
}
