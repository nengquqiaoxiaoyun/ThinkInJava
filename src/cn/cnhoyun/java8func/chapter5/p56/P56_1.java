package cn.cnhoyun.java8func.chapter5.p56;

import org.junit.Test;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.util.Arrays.asList;

/**
 * 1. 方法引用
 * 回顾第三章的例子，使用方法引用改写以下方法
 *
 * @author: huakaimay
 * @since: 2020-12-22
 */
public class P56_1 {

    @Test
    public void c1() {
        List<String> collect = Stream.of("a", "b").map(String::toUpperCase).collect(Collectors.toList());
        System.out.println(collect);
    }

    @Test
    public void c2() {
        int reduce = Stream.of(1, 2, 3, 4).reduce(this::count).get();
        System.out.println(reduce);
    }
    
    @Test
    public void c3() {
        Stream<Integer> integerStream = Stream.of(asList(1, 2), asList(3, 4)).flatMap(this::join);
    }

    public Stream<Integer> join(List<Integer> a) {
        return a.stream();
    }

    public int count(int a, int b) {
        return a + b;
    }
}
