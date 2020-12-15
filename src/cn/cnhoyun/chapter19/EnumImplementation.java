// enums/cartoons/EnumImplementation.java
// An enum can implement an interface
// {java enums.cartoons.EnumImplementation}
package cn.cnhoyun.chapter19;

import java.util.*;
import java.util.function.*;
import java.util.stream.Stream;

enum CartoonCharacter implements Supplier<CartoonCharacter> {
    SLAPPY, SPANKY, PUNCHY,
    SILLY, BOUNCY, NUTTY, BOB;



    private static Random rand = new Random(47);

    static CartoonCharacter next() {
        CartoonCharacter[] values = CartoonCharacter.values();
        return values[rand.nextInt(values.length)];
    }

    @Override
    public CartoonCharacter get() {
        return values()[rand.nextInt(values().length)];
    }


}

public class EnumImplementation {
    public static <T> void printNext(Supplier<T> rg) {
        System.out.print(rg.get() + ", ");
    }



    public static void main(String[] args) {
        // Choose any instance:
        CartoonCharacter cc = CartoonCharacter.BOB;

        for (int i = 0; i < CartoonCharacter.values().length; i++) {
            CartoonCharacter next = CartoonCharacter.next();
            System.out.println(next);
        }
        System.out.println(" === === === ");

        Stream.of(CartoonCharacter.values()).forEach(System.out::println);
    }
}
