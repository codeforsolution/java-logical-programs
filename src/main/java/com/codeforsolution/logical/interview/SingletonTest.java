package com.codeforsolution.logical.interview;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class SingletonTest {

    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        Singleton s1 = Singleton.getInstance();
        s1.getMessage();
        Singleton s2 = Singleton.getInstance();
        s2.getMessage();

        print("s1", s1);
        print("s2", s2);

        Class cl = Class.forName("com.codeforsolution.logical.interview.Singleton");
        Constructor<Singleton> declaredConstructors = cl.getDeclaredConstructor();
        declaredConstructors.setAccessible(true);
        Singleton s3 = declaredConstructors.newInstance();
        print("s3", s3);

    }

    private static void print(String name, Singleton object) {
        System.out.println(String.format("Object : %s, Hashcode:  %d", name , object.hashCode()));
    }
}
