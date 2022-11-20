package collection.collection.set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetMethod {
    public static void main(String[] args) {
        Set set = new HashSet();
        set.add("john");
        set.add("mark");
        set.add("john");
        set.add(null);
        set.add(null);

        System.out.println(set);

        Iterator iterator = set.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        for (Object o : set) {
            System.out.println(o);
        }
        // 不能通过索引来获取


    }
}
