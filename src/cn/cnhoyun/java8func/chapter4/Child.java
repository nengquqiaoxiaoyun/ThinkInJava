package cn.cnhoyun.java8func.chapter4;

/**
 * @author: huakaimay
 * @since: 2020-12-21
 */
public interface Child extends Parent{

    @Override
    default void wlecome() {
        message("Child: Hi!");
    }

}
