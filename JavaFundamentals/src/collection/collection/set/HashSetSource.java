package collection.collection.set;

import java.util.HashSet;

public class HashSetSource {
    public static void main(String[] args) {
        // 简单实现
        // 1. 创建一个数组，数组的类型是Node[]
        Node[] table = new Node[16];

        // 2. 添加Node
        Node john = new Node("john", null);
        Node jack = new Node("jack", null);
        Node marry = new Node("marry", null);
        john.next = jack;
        jack.next = marry;
        table[2] = john;

        System.out.println(table);

        // HashSet源码
        HashSet hashSet = new HashSet();
        hashSet.add("john");
        hashSet.add("mark");
        hashSet.add("john");


    }
}

class Node {
    Object item;
    Node next;

    public Node(Object item, Node next) {
        this.item = item;
        this.next = next;
    }

}