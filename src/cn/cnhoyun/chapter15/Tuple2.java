// onjava/Tuple2.java
package cn.cnhoyun.chapter15;

import org.junit.Test;

public class Tuple2<A, B> {
    public final A a1;
    public final B a2;

    public Tuple2(A a, B b) {
        a1 = a;
        a2 = b;
    }

    public String rep() {
        return a1 + ", " + a2;
    }


    @Override
    public String toString() {
        return "(" + rep() + ")";
    }

}
