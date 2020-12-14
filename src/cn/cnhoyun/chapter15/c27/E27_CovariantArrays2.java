package cn.cnhoyun.chapter15.c27;

import java.util.ArrayList;
import java.util.List;

public class E27_CovariantArrays2 {
    public static void main(String[] args) {
        List<? extends Number> list = new ArrayList<Integer>();
        // 编译错误
        // list.add(new Integer(1));
        // list.add(new Float(1.0));
        list.add(null);
        Number number = list.get(0);
    }
}