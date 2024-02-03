package com.codeforsolution.logical.java8;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class HashMapIterateTest {
    public static void main(String[] args) {
        Map<Integer,String> hm= new HashMap<>();
        hm.put(1,"Ram");
        hm.put(2,"Shyam");
        hm.put(3, "vishal");
        hm.put(4, "Anant patil");
        hm.put(5, "satya");

        //Using iterator
        Iterator<Map.Entry<Integer,String>> newIterator = hm.entrySet().iterator();

        while (newIterator.hasNext()){
            Map.Entry<Integer,String>  newHm = newIterator.next();
            System.out.println(newHm.getKey() +" = " + newHm.getValue());
        }

        //Using Lambda Expressions forEach
        hm.forEach((key,value) -> System.out.println( key + " = " +value));

        //using Stream API
        hm.entrySet().stream().forEach(map -> System.out.println(map.getKey() + " = "+map.getValue()));

    }

}
