package collection.collection.list;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListMethod {
    public static void main(String[] args) {
        // 实现双向链表
        // jack -- tom -- mark
        Node jack = new Node("jack");
        Node tom = new Node("tom");
        Node mark = new Node("mark");

        jack.next = tom;
        tom.next = mark;
        tom.prev = jack;
        mark.prev = tom;

        Node first = jack;
        Node last = mark;

        while (true) {
            if (first == null) {
                break;
            }
            System.out.println(first);
            first = first.next;
        }

        // LinkedListMethod
        LinkedList linkedList = new LinkedList();
        linkedList.add(1);
        linkedList.add(2);
        linkedList.add(2);
        linkedList.remove();
        linkedList.remove(1);

        linkedList.set(0,999);
        Object o = linkedList.get(1);

        Iterator iterator = linkedList.iterator();
        while (iterator.hasNext()) {
            Object next = iterator.next();
            System.out.println(next);
        }

        for (Object o1 : linkedList) {
            System.out.println(o1);
        }

        for (int i = 0; i< linkedList.size(); i++) {
            System.out.println(linkedList.get(i));
        }
    }
}

class Node {
    public Object item;
    public Node next;
    public Node prev;
    public Node(Object name) {
        this.item = name;
    }

    @Override
    public String toString() {
        return "Node{" +
                "item=" + item +
                '}';
    }
}
