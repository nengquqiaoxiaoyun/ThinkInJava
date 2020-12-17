package cn.cnhoyun.onjava8.chapter13.closepack;// functional/Closure1.java

import java.util.function.*;
import java.util.stream.Stream;

public class Closure1 {
    int i;

    IntSupplier makeFun(int x) {
        return () -> x + i++;
    }

}
