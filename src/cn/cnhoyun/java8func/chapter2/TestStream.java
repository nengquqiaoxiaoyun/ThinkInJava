package cn.cnhoyun.java8func.chapter2;

import org.junit.Test;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @author: huakaimay
 * @since: 2020-12-18
 */
public class TestStream {

    private static List<Integer> list = new ArrayList<Integer>();

    static {
        list = Arrays.asList(1, 2, 3, 4, 5);
    }

    @Test
    public void test() {
        List<Integer> collect = Stream.of(Arrays.asList(1, 2), Arrays.asList(3, 4))
                .flatMap(numbers -> numbers.stream())
                .collect(Collectors.toList());
        System.out.println(collect);
    }

    @Test
    public void test2() {
        Integer count = Stream.of(1, 2, 3).reduce(0, (acc, ele) -> acc + ele);
        System.out.println(count);
    }
}
