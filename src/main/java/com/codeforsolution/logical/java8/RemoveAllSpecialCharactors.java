package com.codeforsolution.logical.java8;

import java.util.Arrays;
import java.util.List;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class RemoveAllSpecialCharactors {
    public static void main(String[] args) {
        List<String> str = Arrays.asList( "asf123!@#re", "123!@#");
        Pattern pattern = Pattern.compile("[!@#$%^&*]");
        List<String> str1 = str.stream().map(x -> pattern.matcher(x).replaceAll("")).collect(Collectors.toList());
        System.out.println(str1);

        String st = "asf123!@#re";
        String rem = st.replaceAll(pattern.pattern(), "").toString();
        System.out.println(rem);
    }
}
