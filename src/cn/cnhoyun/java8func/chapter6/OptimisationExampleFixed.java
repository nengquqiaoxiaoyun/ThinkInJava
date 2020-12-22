package cn.cnhoyun.java8func.chapter6;


import org.junit.Test;

import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.IntStream;


public class OptimisationExampleFixed {

    @Test
    public void run() {
        init();
        long start = System.currentTimeMillis();
        // slowSumOfSquares
        // serialSlowSumOfSquares
        // serialFastSumOfSquares
        // fastSumOfSquares
        int i = serialSlowSumOfSquares();
        System.out.println(i);
        long end = System.currentTimeMillis();
        System.out.println("耗时：" + (end - start));
    }

    private List<Integer> arrayListOfNumbers;
    private List<Integer> linkedListOfNumbers;

    public void init() {
        arrayListOfNumbers = new ArrayList<>();
        addNumbers(arrayListOfNumbers);

        linkedListOfNumbers = new LinkedList<>();
        addNumbers(linkedListOfNumbers);
    }

    private void addNumbers(List<Integer> container) {
        IntStream.range(0, 1_500_000)
                .forEach(container::add);
    }

    public int slowSumOfSquares() {
        return linkedListOfNumbers.parallelStream()
                .map(x -> x * x)
                .reduce(0, (acc, x) -> acc + x);
    }

    public int serialSlowSumOfSquares() {
        return linkedListOfNumbers.stream()
                .map(x -> x * x)
                .reduce(0, (acc, x) -> acc + x);
    }


    public int fastSumOfSquares() {
        return arrayListOfNumbers.parallelStream()
                .mapToInt(x -> x * x)
                .sum();
    }

    public int serialFastSumOfSquares() {
        return arrayListOfNumbers.stream()
                .mapToInt(x -> x * x)
                .sum();
    }

}