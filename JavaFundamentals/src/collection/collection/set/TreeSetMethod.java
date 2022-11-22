package collection.collection.set;

import java.util.Comparator;
import java.util.TreeSet;

public class TreeSetMethod {
    public static void main(String[] args) {
        TreeSet treeSet = new TreeSet();
        treeSet.add(9);
        treeSet.add(4);
        treeSet.add(1);
        treeSet.add(8);
        System.out.println(treeSet);

        // 指定排序规则
        TreeSet treeSet1 = new TreeSet(new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                return (int) o2 - (int) o1;
            }
        });
        treeSet1.add(9);
        treeSet1.add(4);
        treeSet1.add(1);
        treeSet1.add(8);
        System.out.println(treeSet1);
    }
}
