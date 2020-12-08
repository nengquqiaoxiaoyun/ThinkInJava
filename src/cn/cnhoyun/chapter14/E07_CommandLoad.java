package cn.cnhoyun.chapter14;


public class E07_CommandLoad  {
    // java cn.cnhoyun.chapter14.E07_CommandLoad cn.cnhoyun.chapter14.Candy1
    // 在源文件目录下编译后，再src下执行
    public static void main(String[] args) throws Exception {
        for (String arg : args) {
            System.out.println(arg);
            Class.forName(arg);
        }

    }
}

class Candy1 {
    static {
        System.out.println("Loading Candy1");
    }
}


class Gum1 {
    static {
        System.out.println("Loading Gum1");
    }
}

class Cookie1 {
    static {
        System.out.println("Loading Cookie1");
    }
}