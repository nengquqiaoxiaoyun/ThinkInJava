package cn.cnhoyun.onjava8.chapter14.streams;// streams/StreamOf.java

import org.junit.Test;

import java.util.*;
import java.util.stream.*;

public class StreamOf {
    public static void main(String[] args) {
        Stream.of("It's ", "a ", "wonderful ", "day ", "for ", "pie!").forEach(System.out::print);
        System.out.println();
        Stream.of(3.14159, 2.718, 1.618).forEach(System.out::println);
    }

    @Test
    public void test() {
        Set<String> w = new HashSet<>(Arrays.asList("It's a wonderful day for pie!".split(" ")));
        w.stream().map(x -> x + " ").forEach(System.out::print);
        System.out.println();

        Map<String, Double> m = new HashMap<>();
        m.put("pi", 3.14159);
        m.put("e", 2.718);
        m.put("phi", 1.618);
        m.entrySet().stream().map(e -> e.getKey() + ": " + e.getValue()).forEach(System.out::println);
    }


}
