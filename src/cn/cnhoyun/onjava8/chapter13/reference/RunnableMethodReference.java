package cn.cnhoyun.onjava8.chapter13.reference;// functional/RunnableMethodReference.java

// 方法引用与 Runnable 接口的结合使用

class Go {
    static String go() {
        System.out.println("Go::go()");
        return "let's go";
    }
}

public class RunnableMethodReference {
    public static void main(String[] args) {

        new Thread(new Runnable() {
            public void run() {
                System.out.println("Anonymous");
            }
        }).start();

        new Thread(
                () -> System.out.println("lambda")
        ).start();

        new Thread(Go::go).start();

        Runnable r = Go::go;
        r.run();
    }
}
