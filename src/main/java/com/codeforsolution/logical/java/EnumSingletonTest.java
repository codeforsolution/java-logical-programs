package com.codeforsolution.logical.java;

public enum EnumSingletonTest {
    INSTANCE;

    public void getMessage(){
        System.out.println("Singleton via enum ");
    }
}
