package collection.map.hashtable;

import java.util.Properties;

public class PropertiesMethod {
    public static void main(String[] args) {
        Properties properties = new Properties();
        properties.put(1, "john");
//        properties.put(null,1); // error
        properties.put(1, "mark");
        properties.put(2, "john");
        properties.remove(1);

        System.out.println(properties);
        System.out.println(properties.get(2));
        System.out.println(properties.getProperty("john")); // null 通过key值找value
    }
}
