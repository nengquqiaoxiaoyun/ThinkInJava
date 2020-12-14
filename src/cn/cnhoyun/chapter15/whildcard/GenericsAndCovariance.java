package cn.cnhoyun.chapter15.whildcard;// generics/GenericsAndCovariance.java

import java.util.*;

public class GenericsAndCovariance<T extends Orange> {
    private T t;

    public static void main(String[] args) {
        // Wildcards allow covariance:
        List<? extends Fruit> flist = new ArrayList<>();
        // Compile Error: can't add any type of object:
        // flist.add(new Apple());
        // flist.add(new Fruit());
        // flist.add(new Object());
        flist.add(null); // Legal but uninteresting
        // We know it returns at least Fruit:
        Fruit f = flist.get(0);
        Fruit fruit = flist.get(1);
    }

    public void test() {
        t.fruid();
        t.orange();
    }

}
