package cn.cnhoyun.java8func.chapter4;

/**
 * @author: huakaimay
 * @since: 2020-12-21
 */
public class OverrdingChild extends OverridingParent implements Child {

    public static void main(String[] args) {
        Child child = new OverrdingChild();
        child.wlecome();
    }
}
