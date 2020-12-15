package cn.cnhoyun.chapter15.whildcard;// generics/Holder.java

import java.util.Objects;

public class Holder<T> {

    private T value;

    public Holder() {
    }

    public Holder(T val) {
        value = val;
    }

    public void set(T val) {
        value = val;
    }

    public T get() {
        return value;
    }

    @Override
    public boolean equals(Object o) {
        return o instanceof Holder && Objects.equals(value, ((Holder) o).value);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(value);
    }

    public static <T> void main(String[] args) {
        Holder<Apple> apple = new Holder<>(new Apple());
        Apple d = apple.get();
        apple.set(d);
        // Holder<Fruit> fruit = apple; // Cannot upcast
        // OK
//        Holder<? extends Fruit> fruit = apple;
        Holder<? extends Fruit> fruit = new Holder<>(new Orange());
        Fruit p = fruit.get();
        try {
            d = (Apple) fruit.get();
        } catch (Exception e) {
            System.out.println(e);
        }
        try {
            Orange c = (Orange) fruit.get(); // No warning
        } catch (Exception e) {
            System.out.println(e);
        }
        // fruit.set(new Apple()); // Cannot call set()
        // fruit.set(new Fruit()); // Cannot call set()
        System.out.println(fruit.equals(d)); // OK
    }
}
/* Output
java.lang.ClassCastException: Apple cannot be cast to Orange
false
*/
