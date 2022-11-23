package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class CollectionsMethod {
    public static void main(String[] args) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(9);
        arrayList.add(4);
        arrayList.add(1);
        arrayList.add(8);
        System.out.println(arrayList);

        // 反转
        System.out.println("reverse");
        Collections.reverse(arrayList);
        System.out.println(arrayList);

        // 打乱
        System.out.println("shuffle");
        Collections.shuffle(arrayList);
        System.out.println(arrayList);

        // 排序
        System.out.println("sort");
        Collections.sort(arrayList); // 默认升序
        System.out.println(arrayList);
        Collections.sort(arrayList, new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                return (int) o2 - (int) o1;
            }
        });
        System.out.println(arrayList);

        // 交换 index
        System.out.println("swap");
        Collections.swap(arrayList, 0, 1);
        System.out.println(arrayList);
    }
}
