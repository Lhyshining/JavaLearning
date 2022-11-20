package collection.map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapMethod {
    public static void main(String[] args) {
        Map map = new HashMap();
        map.put(1, "john");
        map.put(2, "mark");
        map.put("john", "john");
        map.put(2, "marry"); // 替换
        map.put(null,null);

        System.out.println(map);

        Set set = map.entrySet();
        for (Object o :set) {
            Map.Entry entry = (Map.Entry) o;
            System.out.println(entry.getKey() + "-" + entry.getValue());
        }

        // 常用方法
        map.remove(1);
        map.get(2);
        map.size();
        map.isEmpty();
        map.containsKey(2);
        map.clear();


    }
}
