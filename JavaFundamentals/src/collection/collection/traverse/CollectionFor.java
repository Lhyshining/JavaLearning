package collection.collection.traverse;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class CollectionFor {
    public static void main(String[] args) {
        Collection list = new ArrayList();
        list.add(new Book("三国演义", "罗贯中", 39.99));
        list.add(new Book("水浒传", "施耐庵", 29.9));
        list.add(new Book("红楼梦", "曹雪芹", 34.99));

        List list1 = new ArrayList();
        list1.add(1);
        list1.add("string");

        for (int i = 0; i < list1.size(); i++) {
            System.out.println(list1.get(i));
        }
    }
}
