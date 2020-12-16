package cn.cnhoyun.chapter20.handler;// annotations/UseCaseTracker.java

import cn.cnhoyun.chapter20.atunit.PasswordUtils;
import cn.cnhoyun.chapter20.atunit.UseCase;

import java.lang.annotation.Annotation;
import java.util.*;
import java.util.stream.*;
import java.lang.reflect.*;

public class UseCaseTracker {
    public static void trackUseCases(List<Integer> useCases, Class<?> cl) {
        for (Method m : cl.getDeclaredMethods()) {
            UseCase uc = m.getAnnotation(UseCase.class);
            if (uc != null) {
                System.out.println("Found Use Case " +
                        uc.id() + "\n " + uc.description());
                useCases.remove(Integer.valueOf(uc.id()));
            }
        }
        useCases.forEach(i ->
                System.out.println("Missing use case " + i));
    }

    public static void main(String[] args) {
        List<Integer> useCases = IntStream.range(47, 51).boxed().collect(Collectors.toList());
        trackUseCases(useCases, PasswordUtils.class);
    }
}
