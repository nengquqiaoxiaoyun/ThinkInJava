// onjava/Sets.java

package cn.cnhoyun.chapter15;

import java.util.EnumSet;
import java.util.HashSet;
import java.util.Set;

public class Sets {

    public static <T> Set<T> copy(Set<T> set) {
        if (EnumSet.class.isInstance(set)) {
            return ((EnumSet) set).clone();
        }
        return new HashSet<T>();
    }

    // 合并 （并集）
    public static <T> Set<T> union(Set<T> a, Set<T> b) {
        Set<T> result = copy(a);

        result.addAll(b);
        return result;
    }

    // 共有部分（交集）
    public static <T> Set<T> intersection(Set<T> a, Set<T> b) {
        Set<T> result = copy(a);
        result.retainAll(b);
        return result;
    }

    // 从 superset中移除 subset包含的元素
    public static <T> Set<T> difference(Set<T> superset, Set<T> subset) {
        Set<T> result = copy(superset);
        result.removeAll(subset);
        return result;
    }

    // 不在交集的元素
    public static <T> Set<T> complement(Set<T> a, Set<T> b) {
        return difference(union(a, b), intersection(a, b));
    }
}
