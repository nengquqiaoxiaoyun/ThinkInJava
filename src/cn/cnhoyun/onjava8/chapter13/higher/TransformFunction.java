package cn.cnhoyun.onjava8.chapter13.higher;// functional/TransformFunction.java

import java.util.function.*;

class I {
    @Override
    public String toString() {
        return "III";
    }
}

class O {
    @Override
    public String toString() {
        return "OOO";
    }
}

public class TransformFunction {
    static Function<I, O> transform(Function<I, O> in) {
        return in.andThen(o -> {
            System.out.println(o + "：222");
            return o;
        });
    }

    public static void main(String[] args) {

        Function<I, O> f2 = transform(i -> {
            System.out.println(i + "： 111");
            return new O();
        });


        O o = f2.apply(new I());
    }
}
