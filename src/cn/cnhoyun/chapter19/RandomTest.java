package cn.cnhoyun.chapter19;// enums/RandomTest.java

import java.util.stream.Stream;

enum Activity {
    SITTING, LYING, STANDING, HOPPING,
    RUNNING, DODGING, JUMPING, FALLING, FLYING
}

public class RandomTest {
    public static void main(String[] args) {

        for (int i = 0; i < 20; i++) {
            Activity random = Enums.random(Activity.class);
            System.out.print(random + " ");
        }
        System.out.println();
        Stream.of(Activity.values()).forEach((t) -> {
            System.out.print(t + " ");
        });

    }
}
