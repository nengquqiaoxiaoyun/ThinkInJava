package cn.cnhoyun.onjava8.chapter14.streams;// streams/Duplicator.java

import cn.cnhoyun.onjava8.chapter14.Bubble;

import java.util.stream.*;

public class Duplicator {
    public static void main(String[] args) {
        Stream.generate(Bubble::bubbler)
                .limit(3)
                .forEach(System.out::println);
    }
}
