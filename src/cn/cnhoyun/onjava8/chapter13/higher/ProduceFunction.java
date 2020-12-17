package cn.cnhoyun.onjava8.chapter13.higher;// functional/ProduceFunction.java

import java.util.function.*;

interface FuncSS extends Function<String, Integer> {
} // [1]

public class ProduceFunction {
    static FuncSS produce() {
        return s -> Integer.valueOf(s); // [2]
    }

    public static void main(String[] args) {
        FuncSS f = produce();
        System.out.println(f.apply("15"));
    }
}
