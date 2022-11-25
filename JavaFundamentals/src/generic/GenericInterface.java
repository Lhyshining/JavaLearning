package generic;

public interface GenericInterface<U, R> {
//    U name; // error 静态成员不能使用泛型
    R get(U u);

    void hi(R r);

    void run(R r1, R r2, U u1, U u2);

    default R method(U u) {
        return null;
    }
}
