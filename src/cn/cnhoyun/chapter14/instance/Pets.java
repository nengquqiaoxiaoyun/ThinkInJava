// typeinfo/pets/Pets.java
// Facade to produce a default PetCreator
package cn.cnhoyun.chapter14.instance;

import java.util.*;
import java.util.stream.*;

public class Pets {
    public static final PetCreator CREATOR = new LiteralPetCreator();
//    public static final PetCreator CREATOR = new ForNameCreator();

    public static Pet get() {
        return CREATOR.get();
    }

    public static Pet[] array(int size) {
        Pet[] result = new Pet[size];
        for (int i = 0; i < size; i++)
            result[i] = CREATOR.get();
        return result;
    }

    public static List<Pet> list(int size) {
        List<Pet> result = new ArrayList<>();
        Collections.addAll(result, array(size));
        return result;
    }

    public static Stream<Pet> stream() {
        /**
         * generate中的参数需要实现 Supplier ,提供get方法，这里的CREATOR的父类实现了Supplier
         * get方法（伪）随机返回实例
         * 具体返回的types需要子类自己实现
         */
        return Stream.generate(CREATOR);
    }
}
