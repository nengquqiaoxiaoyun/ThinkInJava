// typeinfo/pets/PetCreator.java
// Creates random sequences of Pets
package cn.cnhoyun.chapter14.instance;

import java.util.*;
import java.util.function.*;

/**
 * 它可以随机地创建不同类型的宠物
 */
public abstract class PetCreator implements Supplier<Pet> {
    private Random rand = new Random(47);

    // The List of the different types of Pet to create:
    public abstract List<Class<? extends Pet>> types();

    // Create one random Pet
    public Pet get() {
        int n = rand.nextInt(types().size());
        try {
            return types().get(n).newInstance();
        } catch (InstantiationException |
                IllegalAccessException e) {
            throw new RuntimeException(e);
        }
    }
}
