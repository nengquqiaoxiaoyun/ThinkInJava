package cn.cnhoyun.onjava8.chapter13.fcinter;


import java.util.function.*;

class In1 {
}

class In2 {
}

public class MethodConversion {
    static void accept(In1 i1, In2 i2) {
        System.out.println("accept()");

    }

    static String someOtherName(In1 i1, In2 i2) {
        System.out.println("someOtherName()");
        return "";
    }

    public static void main(String[] args) {
        BiConsumer<In1, In2> bic;

        bic = MethodConversion::accept;
        bic.accept(new In1(), new In2());

        bic = MethodConversion::someOtherName;
        // bic.someOtherName(new In1(), new In2()); // Nope
        bic.accept(new In1(), new In2());
    }
}
