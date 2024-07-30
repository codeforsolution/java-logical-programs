package com.codeforsolution.logical.java;

import java.util.Arrays;
import java.util.stream.Collectors;

public class ImmutableTest {
    public static void main(String[] args) {
        ImmutableClass immutableClass = new ImmutableClass(1, "Satya", new EmployeeImmutable(2, "Vishal", 28, 1800000.00, "Male"), Arrays.stream(new String[]{"1234","2132"}).collect(Collectors.toList()));
//        immutableClass.setId(2);
//        immutableClass.setName("Rakesh");
//        immutableClass.getEmployee().setId(20);
        immutableClass.getMobileNumber().add("543");
        System.out.println(immutableClass);
    }
}
