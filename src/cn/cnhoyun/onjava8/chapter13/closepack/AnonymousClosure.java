package cn.cnhoyun.onjava8.chapter13.closepack;

import java.util.function.IntSupplier;

public class AnonymousClosure {

    int b = 1;

    IntSupplier makeFun(int x) {
        int i = 0;

        // 同样规则的应用:
        // i++; // 非等同 final 效果
        // x++; // 同上
        return new IntSupplier() {
            int a = 1;
            public int getAsInt() {
                System.out.println("a: " + a++);
                System.out.println("b: " + b++);
                return x + i;
            }
        };
    }

    public static void main(String[] args) {
        AnonymousClosure anonymousClosure = new AnonymousClosure();
        int asInt = anonymousClosure.makeFun(0).getAsInt();
        int asInt2 = anonymousClosure.makeFun(0).getAsInt();
    }
}