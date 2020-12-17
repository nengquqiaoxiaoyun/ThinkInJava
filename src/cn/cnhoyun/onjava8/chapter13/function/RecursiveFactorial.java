package cn.cnhoyun.onjava8.chapter13.function;// functional/RecursiveFactorial.java

import org.junit.Test;

interface IntCall {
    int call(int arg);
}

public class RecursiveFactorial {
    static IntCall fact;

    public static void main(String[] args) {
//        fact = n -> n == 0 ? 1 : n * fact.call(n - 1);

        //  1 1 2 3 5
        fact = n -> n <= 2
                ? 1 : fact.call(n - 1) + fact.call(n - 2);
        int call = fact.call(3);
        System.out.println(call);
    }

    @Test
    public void test() {
        fact = n -> n == 0 ? 1 : n * fact.call(n - 1);
        for (int i = 0; i <= 10; i++)
            System.out.println(fact.call(i));
    }
}
