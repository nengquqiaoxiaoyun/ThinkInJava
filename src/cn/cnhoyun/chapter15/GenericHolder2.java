package cn.cnhoyun.chapter15;

/**
 * @author: huakaimay
 * @since: 2020-12-14
 */
public class GenericHolder2<T> {

    private T t;

    public void set(T t) {
        this.t = t;
    }

    public T get() {
        return t;
    }

    public static void main(String[] args) {
        GenericHolder2<String> stringGenericHolder2 = new GenericHolder2<>();
        stringGenericHolder2.set("item");
        String s = stringGenericHolder2.get();
        System.out.println(s);
    }
}
