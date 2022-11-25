package generic;

import org.junit.jupiter.api.Test;

import java.util.*;

/*
    定义泛型类DAO<T>，在其中定义一个Map成员变量，Map的key为String，value为T类型
    分别创建以下办法：
    (1) public void save(String id, T entity): 保存T类型对象到Map成员变量中
    (2) public T get(String id): 从map中获取id对应的对象
    (3) public void update(String id, T entity) 替换map中key为id的内容，改为entity对象
    (4) public List<T> list() 返回map中存放的所有T对象
    (5) public void delete(String id) 删除指定id对象

    定义一个User类，包含private的(int) id,age,(String)name
    创建DAO类的对象，分别调用其save...来操作User对象
    使用Junit单元测试类进行测试

 */
public class GenericExercise {
    public static void main(String[] args) {
        new GenericExercise().test();
    }

    @Test
    public void test() {
        DAO<User> userDAO = new DAO<>();
        userDAO.save("001", new User(1, 18, "mark"));
        userDAO.save("002", new User(2, 20, "marry"));
        userDAO.save("003", new User(3, 23, "lucy"));
        List<User> list = userDAO.list();
        System.out.println(list);
        userDAO.update("003", new User(3, 24, "lucy"));
        System.out.println(userDAO.list());
    }
}

class User {
    private int id;
    private int age;
    private String name;

    public User(int id, int age, String name) {
        this.id = id;
        this.age = age;
        this.name = name;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", age=" + age +
                ", name='" + name + '\'' +
                '}';
    }
}

class DAO<T> {
    private Map<String, T> map = new HashMap<>();

    public void save(String id, T entity) {
        this.map.put(id, entity);
    }

    public T get(String id) {
        return this.map.get(id);
    }

    public void update(String id, T entity) {
        this.map.put(id, entity);
    }

    public List<T> list() {
        Collection<T> values = this.map.values();
        return new ArrayList<>(values);
    }

    public void delete(String id) {
        this.map.remove(id);
    }

}