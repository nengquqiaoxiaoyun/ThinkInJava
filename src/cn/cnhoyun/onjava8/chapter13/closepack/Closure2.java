package cn.cnhoyun.onjava8.chapter13.closepack;// functional/Closure2.java

import java.util.function.*;

public class Closure2 {
    final int i = 0;

    IntSupplier makeFun(int x) {
        // 被 Lambda 表达式引用的局部变量必须是 final 或者是等同 final 效果的。
        return () -> x + i;
    }
}
