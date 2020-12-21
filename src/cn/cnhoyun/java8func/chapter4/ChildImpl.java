package cn.cnhoyun.java8func.chapter4;

/**
 * @author: huakaimay
 * @since: 2020-12-21
 */
public class ChildImpl implements Child{
    @Override
    public void message(String body) {
        System.out.println(body);
    }


    @Override
    public String getLastMessage() {
        return null;
    }

    public static void main(String[] args) {
        ChildImpl child = new ChildImpl();
        child.wlecome();
    }
}
