package generic;

public class GenericMethod {
    public static void main(String[] args) {
        Bird bird = new Bird();
        bird.fly("mark", 1);

    }
}

class Bird {
    public void eat() { // 普通方法

    }


    public <T,R> void fly(T t, R r) { // 泛型方法

    }
}

class Fish<T,R> {
    public void eat() { // 普通方法

    }

    public void hi(T t) { // 普通方法，只是使用了泛型

    }

    public <U,M> void fly(U u, M m) { // 泛型方法

    }
}