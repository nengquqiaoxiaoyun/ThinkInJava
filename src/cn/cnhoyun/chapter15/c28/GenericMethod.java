package cn.cnhoyun.chapter15.c28;

import cn.cnhoyun.chapter14.instance.Cat;
import cn.cnhoyun.chapter14.instance.Mouse;
import cn.cnhoyun.chapter14.instance.Pet;
import cn.cnhoyun.chapter14.instance.Rodent;

/**
 * @author: huakaimay
 * @since: 2020-12-15
 */
public class GenericMethod {

    static <T> void f1(Generic<? super T> generic, T item) {
        generic.set(item);
    }

    static <T> T f2(Generic2<? extends T> generic) {
        return generic.get();
    }

    public static void main(String[] args) {
        Generic<Rodent> g1 = new Generic<>();
        f1(g1, new Mouse()); // OK
        // Compile error: Cat is not a Rodent
        // f1(g1, new Cat());
        Generic2<Pet> g2 = new Generic2<>();
        Pet pet = f2(g2); // OK
        Generic2<Cat> g3 = new Generic2<>();
        Cat cat = f2(g3); // OK
        pet = f2(g3); // OK
    }
}
