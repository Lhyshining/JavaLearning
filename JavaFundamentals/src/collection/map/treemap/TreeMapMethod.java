package collection.map.treemap;

import java.util.Comparator;
import java.util.TreeMap;

public class TreeMapMethod {
    public static void main(String[] args) {
        TreeMap treeMap = new TreeMap();
        treeMap.put(2, "mark");
        treeMap.put(3, "john");
        treeMap.put(2, "marry");
        treeMap.put(1, "ash");

        System.out.println(treeMap);

        TreeMap treeMap2 = new TreeMap(new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                return (int) o2 - (int) o1;
            }
        });
        treeMap2.put(2, "mark");
        treeMap2.put(3, "john");
        treeMap2.put(2, "marry");
        treeMap2.put(1, "ash");
        System.out.println(treeMap2);
    }
}
