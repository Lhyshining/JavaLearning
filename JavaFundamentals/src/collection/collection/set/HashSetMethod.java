package collection.collection.set;

import java.util.HashSet;

public class HashSetMethod {
    public static void main(String[] args) {
        HashSet hashSet = new HashSet();
        hashSet.add("john");
        hashSet.add("mark");
        hashSet.add("john");
        hashSet.remove("john");
        hashSet.add(null);
        System.out.println(hashSet.add("mark"));
        System.out.println(hashSet);

        System.out.println(hashSet.add(new Dog("bai")));
        System.out.println(hashSet.add(new Dog("bai")));
        System.out.println(hashSet);

        System.out.println(hashSet.add(new String("wang")));
        System.out.println(hashSet.add(new String("wang")));
        System.out.println(hashSet);
    }
}

class Dog {
    private String name;

    public Dog(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name=" + name +
                '}';
    }
}