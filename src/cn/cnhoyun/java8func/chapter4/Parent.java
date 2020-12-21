package cn.cnhoyun.java8func.chapter4;

/**
 * @author: huakaimay
 * @since: 2020-12-21
 */
public interface Parent {

    void message(String body);

    default void wlecome() {
        message("Parent: Hi");
    }

    String getLastMessage();
}
