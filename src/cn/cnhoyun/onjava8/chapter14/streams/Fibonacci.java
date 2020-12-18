package cn.cnhoyun.onjava8.chapter14.streams;// streams/Fibonacci.java

import java.util.stream.*;

public class Fibonacci {
    int x = 1;

    Stream<Integer> numbers() {
        return Stream.iterate(1, i -> {
            int result = x += i;
            x = i;
            return result;
        });
    }

    public static void main(String[] args) {
        new Fibonacci().numbers().skip(5) // 过滤前 20 个
                .limit(5) // 然后取 10 个
                .forEach(System.out::println);
    }
}
