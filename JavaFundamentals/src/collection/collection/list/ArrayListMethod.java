package collection.collection.list;

import java.util.ArrayList;
import java.util.List;

public class ArrayListMethod {
    public static void main(String[] args) {
        List list = new ArrayList();
        // add
        list.add(1);
        list.add(2);
        list.add(true);
        System.out.println(list);

        // remove 输入数字时会优先认为是索引
        list.remove(0);
        list.remove((Integer) 2);
        System.out.println(list);

        // contains 查找元素是否存在
        System.out.println(list.contains(1));

        // size
        System.out.println(list.size());

        // isEmpty
        System.out.println(list.isEmpty());

        // clear
        list.clear();
        System.out.println(list);

        // addAll
        ArrayList list2 = new ArrayList();
        list2.add(1);
        list2.add(2);
        list2.add(true);
        list.addAll(list2);
        System.out.println(list);

        // containsAll 查询多个元素是否都存在
        System.out.println(list.containsAll(list2));

        // removeAll
        list.add("remained");
        list.removeAll(list2);
        System.out.println(list);
    }
}
