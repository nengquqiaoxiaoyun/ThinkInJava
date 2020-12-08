// typeinfo/pets/ForNameCreator.java
package cn.cnhoyun.chapter14.instance;

import java.util.*;

/**
 * 根据类路径创建对象
 */
public class ForNameCreator extends PetCreator {

    private static List<Class<? extends Pet>> types =
            new ArrayList<>();
    // 需要随机生成的类型名:
    private static String[] typeNames = {
            "cn.cnhoyun.chapter14.instance.Mutt",
            "cn.cnhoyun.chapter14.instance.Pug",
            "cn.cnhoyun.chapter14.instance.EgyptianMau",
            "cn.cnhoyun.chapter14.instance.Manx",
            "cn.cnhoyun.chapter14.instance.Cymric",
            "cn.cnhoyun.chapter14.instance.Rat",
            "cn.cnhoyun.chapter14.instance.Mouse",
            "cn.cnhoyun.chapter14.instance.Hamster"
    };

    @SuppressWarnings("unchecked")
    private static void loader() {
        try {
            for (String name : typeNames)
                types.add(
                        (Class<? extends Pet>) Class.forName(name));
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    static {
        loader();
    }

    @Override
    public List<Class<? extends Pet>> types() {
        return types;
    }
}
