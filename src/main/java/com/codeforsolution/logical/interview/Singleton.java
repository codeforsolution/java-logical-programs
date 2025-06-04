package com.codeforsolution.logical.interview;

public class Singleton {
    private static Singleton instance = null;

    private Singleton(){
        System.out.println("Private constructor method");
    }

    public static Singleton getInstance(){
        if(instance == null){
            instance = new Singleton();
        }
        return instance;
    }

    public void getMessage(){
        System.out.println("Singleton test method");
    }
}
