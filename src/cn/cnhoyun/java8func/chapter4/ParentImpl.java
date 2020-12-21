package cn.cnhoyun.java8func.chapter4;

/**
 * @author: huakaimay
 * @since: 2020-12-21
 */
public class ParentImpl implements Parent{
    @Override
    public void message(String body) {
        System.out.println(body);
    }

    @Override
    public String getLastMessage() {
        return null;
    }

    public static void main(String[] args) {
        ParentImpl parent = new ParentImpl();
        parent.wlecome();
    }
}
