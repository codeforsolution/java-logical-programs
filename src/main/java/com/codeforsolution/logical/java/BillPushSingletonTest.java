package com.codeforsolution.logical.java;

public class BillPushSingletonTest {

    private BillPushSingletonTest(){}

    private static class SingletonHelper {
        private static final BillPushSingletonTest INSTANCE = new BillPushSingletonTest();
    }

    public static BillPushSingletonTest getInstance(){
        return SingletonHelper.INSTANCE;
    }
}
