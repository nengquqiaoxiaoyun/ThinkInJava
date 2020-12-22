package cn.cnhoyun.onjava8;


/**
 * @author: huakaimay
 * @since: 2020-12-22
 */
public class AnnoTracker {

    public static void main(String[] args) {
        MyAnn annotation1 = A.class.getAnnotation(MyAnn.class);
        String name = annotation1.name();
        String id = annotation1.id();
        System.out.println(name + ":" + id);
    }
}
