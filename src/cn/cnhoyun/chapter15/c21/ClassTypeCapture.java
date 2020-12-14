package cn.cnhoyun.chapter15.c21;

import java.lang.reflect.Array;
import java.util.HashMap;
import java.util.Map;

class Building {
}

class House extends Building {
}

public class ClassTypeCapture {
    Map<String, Class<?>> map = new HashMap<>();

    void addTye(String typename, Class<?> kind) {
        map.put(typename, kind);
    }

    // 根据typename创建一个新的实例 typename关联了一个class
    void createNew(String typename) {
        Class<?> type = map.get(typename);
        try {
            Object o = type.newInstance();
            System.out.println("instance is: " + o.getClass().getSimpleName());
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (NullPointerException ne) {
            System.err.println(typename + " is not register");
        }
    }


    public static void main(String[] args) {
        ClassTypeCapture buildingClassTypeCapture = new ClassTypeCapture();
        buildingClassTypeCapture.addTye("building", Building.class);
        buildingClassTypeCapture.createNew("building");

        buildingClassTypeCapture.addTye("house", House.class);
        buildingClassTypeCapture.createNew("house");

        buildingClassTypeCapture.createNew("car");

    }
}
 
