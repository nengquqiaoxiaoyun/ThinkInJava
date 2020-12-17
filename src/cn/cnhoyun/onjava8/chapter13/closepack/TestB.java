package cn.cnhoyun.onjava8.chapter13.closepack;

/**
 * @author: huakaimay
 * @since: 2020-12-17
 */
public class TestB {

    public static void main(String[] args) {
        int a = TestA.a;
        TestA testA = new TestA();
        int b = testA.b;
        System.out.println(a);
        System.out.println(b);
        TestA.a++;
        testA.b++;
        TestA testA1 = new TestA();
        System.out.println(testA1.a);
        System.out.println(testA1.b);
    }
}
