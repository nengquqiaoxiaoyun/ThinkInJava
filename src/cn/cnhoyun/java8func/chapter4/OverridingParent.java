package cn.cnhoyun.java8func.chapter4;

/**
 * @author: huakaimay
 * @since: 2020-12-21
 */
public class OverridingParent extends ParentImpl {

    @Override
    public void wlecome() {
        message("Class Parent: Hi");
    }

    public static void main(String[] args) {
        Parent parent = new OverridingParent();
        parent.wlecome();
    }
}
