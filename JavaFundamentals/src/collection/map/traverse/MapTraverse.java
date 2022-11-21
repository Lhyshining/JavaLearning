package collection.map.traverse;


import java.util.*;

public class MapTraverse {
    public static void main(String[] args) {
        Map map = new HashMap();
        map.put(1, "john");
        map.put(2, "mark");
        map.put("john", "john");
        map.put(null, null);

        // 1. 先取出所有的Key，通过Key取出对应的Value,keySet为Map接口
        Set keySet = map.keySet();
        // (1) forI
        System.out.println("--------1.1--------");
        for (Object key : keySet) {
            System.out.println(key + "-" + map.get(key));
        }
        // (2) Iterator
        System.out.println("--------1.2--------");
        Iterator iterator = keySet.iterator();
        while (iterator.hasNext()) {
            Object key = iterator.next();
            System.out.println(key + "-" + map.get(key));
        }

        // 2. 把所有的Value取出
        Collection values = map.values();
        // (1) forI
        // (2) Iterator

        // 3. Map$entrySet获取
        Set entrySet = map.entrySet();
        // (1) forI
        System.out.println("--------3.1--------");
        for (Object o :entrySet) {
            Map.Entry entry = (Map.Entry) o;
            System.out.println(entry.getKey() + "-" + entry.getValue());
        }
        // (2) Iterator
        System.out.println("--------3.2--------");
        Iterator iterator1 = entrySet.iterator();
        while (iterator1.hasNext()) {
            Object o =  iterator1.next();
            Map.Entry entry = (Map.Entry) o;
            System.out.println(entry.getKey() + "-" + entry.getValue());
        }

        // 4. 使用HashMap类



    }
}
