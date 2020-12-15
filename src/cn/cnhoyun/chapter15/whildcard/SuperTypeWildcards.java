package cn.cnhoyun.chapter15.whildcard;


import cn.cnhoyun.chapter15.whildcard.Apple;
import cn.cnhoyun.chapter15.whildcard.Jonathan;

import java.util.List;

/**
 * @author: huakaimay
 * @since: 2020-12-14
 */
public class SuperTypeWildcards {
    static void writeTo(List<? super Apple> apples) {
        apples.add(new Apple());
        apples.add(new Jonathan());
//         apples.add(new Fruit()); // Error
    }
}
