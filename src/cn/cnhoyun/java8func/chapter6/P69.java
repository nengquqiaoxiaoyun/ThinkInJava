package cn.cnhoyun.java8func.chapter6;

import java.util.List;
import java.util.stream.IntStream;

import static java.util.Arrays.asList;

/**
 * @author: huakaimay
 * @since: 2020-12-22
 */
public class P69 {

    public static int sequentialSumOfSquares(IntStream range) {
        return range
                .parallel()
                .map(x -> x * x)
                .sum();
    }


    public static int multiplyThrough(List<Integer> numbers) {
        return 5 * numbers.parallelStream()
                .reduce(1, (acc, x) -> x * acc);
    }

    public static void main(String[] args) {
        int i = multiplyThrough(asList(1, 2, 3, 4, 5));
        System.out.println(i);
    }

}
