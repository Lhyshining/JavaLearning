package collection.traverse;

import java.util.ArrayList;
import java.util.Collection;

public class CollectionForeach {
    public static void main(String[] args) {
        Collection list = new ArrayList();
        list.add(new Book("三国演义", "罗贯中", 39.99));
        list.add(new Book("水浒传", "施耐庵", 29.9));
        list.add(new Book("红楼梦", "曹雪芹", 34.99));

        for (Object book:list) {
            System.out.println(book);
        }
    }
}
