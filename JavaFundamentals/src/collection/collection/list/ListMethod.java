package collection.collection.list;

import java.util.ArrayList;
import java.util.List;

public class ListMethod {
    public static void main(String[] args) {
        List list = new ArrayList();
        // add
        // void add(int index, Object ele); 在index处插入对象
        list.add(1);
        list.add(2);
        list.add(true);
        System.out.println(list);

        // get
        System.out.println(list.get(0));

        // set
        // Object set(int index, Object ele);
        list.set(0,2);
        System.out.println(list);

        // remove 输入数字时会优先认为是索引
        list.remove(0);
        list.remove((Integer) 2);
        System.out.println(list);

        // contains 查找元素是否存在
        System.out.println(list.contains(1));

        // indexOf 查询首次出现位置
        System.out.println(list.indexOf(2));
        // lastIndexOf最后一次出现位置

        // size
        System.out.println(list.size());

        // isEmpty
        System.out.println(list.isEmpty());

        // clear
        list.clear();
        System.out.println(list);

        // addAll
//        void addAll(int index, Object ele); 在index处插入对象
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

        // subList [,)
        List returnList = list.subList(0,1);
        System.out.println(returnList);

    }
}
