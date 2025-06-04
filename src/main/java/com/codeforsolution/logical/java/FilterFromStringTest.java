package com.codeforsolution.logical.java;

public class FilterFromStringTest {
    public static void main(String[] args) {
        String str = "acdsb123%43@";
        int sum = 0;
        StringBuilder stringBuilder = new StringBuilder();
        StringBuilder specialCharector = new StringBuilder();
        for(int i=0; i<str.length(); i++){
            if(Character.isDigit(str.charAt(i))){
               sum += Integer.parseInt(str.charAt(i) + "");
            } else if(Character.isAlphabetic(str.charAt(i))){
                stringBuilder.append(str.charAt(i));
            }else {
                specialCharector.append(str.charAt(i));
            }

        }
        System.out.println("Sum of integer numbers -> "+sum);
        System.out.println("All characters from string ->  "+stringBuilder);
        System.out.println("All special characters from string ->  "+specialCharector);
    }
}
