package cn.cnhoyun.chapter14;

import org.junit.Test;

/**
 * @author: huakaimay
 * @since: 2020-12-07
 */
public class C14_1 {

    public static void main(String[] args) {
        System.out.println();

    }

    @Override
    public String toString() {
        return "C14_1";
    }

    @Test
    public void test() {
        System.out.print(this);
        System.out.println(this.getClass());
    }
}
