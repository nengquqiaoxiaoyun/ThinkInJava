package cn.cnhoyun.chapter7;

/**
 * @author: huakaimay
 * @since: 2020-12-04
 */
public class C7_2_2 {
    public static void main(String[] args) {
        C a = new C();
    }
}

class A {
    public A() {
        System.out.println("A");
    }
}

class B {

    public B() {
        System.out.println("B");
    }
}

class C extends A{

    B b = new B();
}
