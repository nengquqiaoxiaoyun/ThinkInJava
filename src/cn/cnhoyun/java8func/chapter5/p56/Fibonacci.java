package cn.cnhoyun.java8func.chapter5.p56;

import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

public class Fibonacci {

    private final Map<Integer, Long> cache;

    public Fibonacci() {
        cache = new HashMap<>();
        cache.put(0, 0L);
        cache.put(1, 1L);
    }

    public long fibonacci(int x) {
        return cache.computeIfAbsent(x, n -> fibonacci(n - 1) + fibonacci(n - 2));
    }

    @Test
    public void run() {
        long fibonacci = fibonacci(0);
        System.out.println(fibonacci);
    }

}