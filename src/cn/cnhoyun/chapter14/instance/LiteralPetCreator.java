// typeinfo/pets/LiteralPetCreator.java
// 使用类字面量
// {java typeinfo.pets.LiteralPetCreator}
package cn.cnhoyun.chapter14.instance;

import java.util.*;

public class LiteralPetCreator extends PetCreator {
    // try 代码块不再需要
    @SuppressWarnings("unchecked")
    public static final List<Class<? extends Pet>> ALL_TYPES =
            Collections.unmodifiableList(Arrays.asList(
                    Pet.class, Dog.class, Cat.class, Rodent.class,
                    Mutt.class, Pug.class, EgyptianMau.class,
                    Manx.class, Cymric.class, Rat.class,
                    Mouse.class, Hamster.class, Gerbil.class));
    // 用于随机创建的类型:
    private static final List<Class<? extends Pet>> TYPES =
            ALL_TYPES.subList(ALL_TYPES.indexOf(Cat.class),
                    ALL_TYPES.size());

    @Override
    public List<Class<? extends Pet>> types() {
        return TYPES;
    }

    public static void main(String[] args) {
        TYPES.forEach(pet -> System.out.print(pet.getSimpleName() + " "));
    }
}
