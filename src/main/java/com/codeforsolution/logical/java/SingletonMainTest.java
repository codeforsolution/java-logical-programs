package com.codeforsolution.logical.java;

public class SingletonMainTest {

    public static void main(String[] args) {

        ThreadSafeSingleton safeSingleton = ThreadSafeSingleton.getInstance();
        safeSingleton.print();

        ThreadSafeSingleton safeSingleton1 = ThreadSafeSingleton.getInstance();

        Runnable task = () -> {
            DoubleCheckSingleton doubleCheckSingleton = DoubleCheckSingleton.getInstance();
            System.out.println(Thread.currentThread().getName() + " -> " + doubleCheckSingleton.hashCode());
        };

/*        Thread t1 = new Thread(task, "Thread-1");
        Thread t2 = new Thread(task, "Thread-2");
        Thread t3 = new Thread(task, "Thread-3");
        t1.start();
        t2.start();
        t3.start();*/

        /*System.out.println(safeSingleton == safeSingleton1);
        System.out.println(safeSingleton.hashCode());
        System.out.println(safeSingleton1.hashCode());*/

        EnumSingletonTest obj1 = EnumSingletonTest.INSTANCE;
        EnumSingletonTest obj2 = EnumSingletonTest.INSTANCE;

        obj1.getMessage();

        System.out.println(obj1 == obj2); // true
        System.out.println(obj1.hashCode());
        System.out.println(obj2.hashCode());

    }
}
