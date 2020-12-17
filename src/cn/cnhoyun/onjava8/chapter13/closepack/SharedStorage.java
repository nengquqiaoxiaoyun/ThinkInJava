package cn.cnhoyun.onjava8.chapter13.closepack;// functional/SharedStorage.java

import java.util.function.*;

public class SharedStorage {
    public static void main(String[] args) {
        Closure1 c1 = new Closure1();
        IntSupplier f1 = c1.makeFun(0);
        IntSupplier f2 = c1.makeFun(0);
        IntSupplier f3 = c1.makeFun(0);
        System.out.println(f1.getAsInt());
        System.out.println(f2.getAsInt());
        System.out.println(f3.getAsInt());

        Closure1 c2 = new Closure1();
        IntSupplier f11 = c2.makeFun(0);
        IntSupplier f22 = c2.makeFun(0);
        IntSupplier f33 = c2.makeFun(0);
        System.out.println(f11.getAsInt());
        System.out.println(f22.getAsInt());
        System.out.println(f33.getAsInt());
    }
}
