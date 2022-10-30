package object;

public interface UserService {
    // 接口中所有的定义其实都是抽象的 public abstract
    public abstract void run(String name);
    // 等同于 void run(String name);

    void add(String name);
    void delete(String name);
    void update(String name);
    void query(String name);
}
