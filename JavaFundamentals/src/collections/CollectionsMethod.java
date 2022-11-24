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

        // max 自然排序最大元素
        System.out.println("max");
        System.out.println(Collections.max(arrayList));

        // min 返回comparator的最大
        Object maxObject = Collections.max(arrayList, new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                return (int) o2 - (int) o1;
            }
        });
        System.out.println("自定义最大值：" + maxObject);

        // min
        System.out.println("min");
        System.out.println(Collections.min(arrayList));

        // frequency
        System.out.println("frequency");
        System.out.println(Collections.frequency(arrayList, 4));

        // copy void copy(List dest, List src);
        // 没赋值前数组大小为0
        System.out.println("copy");
        ArrayList dest = new ArrayList();
        for (int i = 0; i < arrayList.size(); i++) {
            dest.add("");
        }
        Collections.copy(dest, arrayList);
        System.out.println(dest);

        // replaceAll
        System.out.println("replaceAll");
        Collections.replaceAll(dest,8,1);
        System.out.println(dest);
    }
}
