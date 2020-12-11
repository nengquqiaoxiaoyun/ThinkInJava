package cn.cnhoyun.chapter15;// generics/RandomList.java

import java.lang.reflect.Method;
import java.util.*;
import java.util.stream.*;

public class RandomList<T> extends ArrayList<T> {
    private Random rand = new Random(47);

    public T select() {
        return get(rand.nextInt(size()));
    }

    public static void main(String[] args) throws Exception {
        RandomList<String> rs = new RandomList<>();

        Arrays.stream("The quick brown fox jumped over the lazy brown dog".split(" ")).forEach(rs::add);
        IntStream.range(0, 11).forEach(i ->
                System.out.print(rs.select() + " "));
        RandomList<Integer> rs2 = new RandomList<>();
        rs2.add(2);
    }
}
