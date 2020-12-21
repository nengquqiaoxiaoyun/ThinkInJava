package cn.cnhoyun.java8func.chapter3.p39;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * @author: huakaimay
 * @since: 2020-12-21
 */
public class P39_4 {

    /**
     * 高阶函数。下面的Stream函数是高阶函数吗？为什么？
     * a. boolean anyMatch(Predicate<? supter T> predicate);
     * b. Stream<T> limit(long maxSize);
     *
     * a. 是
     * b. 不是
     * 如果函数的参数里包含函数接口或者返回值是一个函数接口，则为高阶函数
     */

    public static void main(String[] args) {
        AtomicInteger atomicInteger = new AtomicInteger(1);
        atomicInteger.incrementAndGet();
        System.out.println(atomicInteger);
        String s = new String();
        s.chars();
    }
}
