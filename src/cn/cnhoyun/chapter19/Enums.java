// onjava/Enums.java
package cn.cnhoyun.chapter19;

import java.util.*;

/**
 * 返回枚举类中随机一个元素
 */
public class Enums {
    private static Random rand = new Random(47);

    public static <T extends Enum<T>> T random(Class<T> ec) {
        return random(ec.getEnumConstants());
    }

    public static <T> T random(T[] values) {
        return values[rand.nextInt(values.length)];
    }
}
