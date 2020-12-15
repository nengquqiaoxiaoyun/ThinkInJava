package cn.cnhoyun.chapter19;

import java.util.stream.Stream;

/**
 * @author: huakaimay
 * @since: 2020-12-15
 */
public enum OzWitch {

    WEST("西面"),

    NORTH("北面"),

    EAST("东面");

    private String des;

    OzWitch(String des) {
        this.des = des;
    }

    public String getDes() {
        return des;
    }


    public static void main(String[] args) {
        for (OzWitch ow : values()) {
            System.out.println(ow + ow.getDes() + ow.getDeclaringClass().getSimpleName());
        }

        Stream.of(values()).forEach(System.out::println);
    }
}
