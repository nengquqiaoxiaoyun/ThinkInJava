package cn.cnhoyun.onjava8.chapter14;// streams/Randoms.java

import org.junit.Test;

import java.util.*;

public class Randoms {

    public static void main(String[] args) {
        new Random(47)
                .ints(5, 20)
                .distinct()
                .limit(7)
                .sorted()
                .forEach(System.out::println);
    }


    @Test
    public void test() {
        Random random = new Random();
        ArrayList<Integer> integers = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            int i1 = (random.nextInt(16) + 5);
            integers.add(i1);
        }
        integers.sort(Comparator.comparingInt(i -> i));
        integers.forEach(System.out::println);

    }


    @Test
    public void test2() {
        Random rand = new Random();
        SortedSet<Integer> rints = new TreeSet<>();
        while (rints.size() < 16) {
            int r = rand.nextInt(16) + 5;
            rints.add(r);
        }
        System.out.println(rints);
    }
}
