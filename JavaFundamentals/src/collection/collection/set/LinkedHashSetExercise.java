package collection.collection.set;

import sun.awt.image.ImageWatched;

import java.util.LinkedHashSet;
import java.util.Objects;

public class LinkedHashSetExercise {
    public static void main(String[] args) {
        // Car类，属性name，price如果相同不能添加
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        linkedHashSet.add(new Car("BMW", 399999));
        linkedHashSet.add(new Car("BENZ", 399998));
        linkedHashSet.add(new Car("BMW", 399999));
        System.out.println(linkedHashSet);
    }
}

class Car {
    private String name;
    private int price;

    public Car(String name, int price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return price == car.price && Objects.equals(name, car.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, price);
    }

    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
