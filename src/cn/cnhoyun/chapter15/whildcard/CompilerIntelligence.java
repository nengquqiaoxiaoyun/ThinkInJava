package cn.cnhoyun.chapter15.whildcard;// generics/CompilerIntelligence.java

import java.util.*;

public class CompilerIntelligence {

    public static void main(String[] args) {
        List<? extends Fruit> flist = Arrays.asList(new Apple());
        Apple a = (Apple) flist.get(0); // No warning
        boolean contains = flist.contains(new Apple());// Argument is 'Object'
        System.out.println(contains);
        int i = flist.indexOf(new Apple());// Argument is 'Object'
        System.out.println(i);
    }

}
