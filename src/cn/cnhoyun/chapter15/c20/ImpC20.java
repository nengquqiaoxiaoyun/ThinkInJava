package cn.cnhoyun.chapter15.c20;

import org.omg.CORBA.Object;

/**
 * @author: huakaimay
 * @since: 2020-12-14
 */
public class ImpC20 implements C20 {
    @Override
    public void a() {
        System.out.println(this.getClass().getSimpleName() + " :a");
    }

    @Override
    public void b() {
        System.out.println(this.getClass().getSimpleName() + " :b");
    }

    <T extends C20> void c(T t) {
        t.a();
        t.b();
        // can not
        // t.d();
    }

    void d() {
        System.out.println("d");
    }

    public static void main(String[] args) {
        ImpC20 impC20 = new ImpC20();
        impC20.c(new ImpC20());
    }
}
