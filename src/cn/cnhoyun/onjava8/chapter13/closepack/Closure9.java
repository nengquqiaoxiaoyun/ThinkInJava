package cn.cnhoyun.onjava8.chapter13.closepack;// functional/Closure9.java

// {无法编译成功}

import java.util.*;
import java.util.function.*;

public class Closure9 {
    Supplier<List<Integer>> makeFun() {
        List<Integer> ai = new ArrayList<>();
      //  ai = new ArrayList<>(); // Reassignment
        return () -> ai;
    }
}
