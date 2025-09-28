package com.codeforsolution.logical.java;

import java.util.Stack;

public class BalanceParanthesesTest {
    public static void main(String[] args) {
        String string = "{[[]}(){]}";
        Stack<Character> stringStack = new Stack<>();
        for(int i = 0; i<string.length(); i++){
            if(string.charAt(i) == '{' || string.charAt(i) == '[' || string.charAt(i) == '('){
                stringStack.push(string.charAt(i));
            } else if ((string.charAt(i) == '}' && stringStack.peek() == '{') || (string.charAt(i) == ']' && stringStack.peek() == '[') || (string.charAt(i) == ')' && stringStack.peek() == '(')) {
                stringStack.pop();
            } else{
                System.out.println(" Not balanced !");
            }

        }
        if(stringStack.isEmpty()){
            System.out.println(string + " is balanced!");
        }
    }
}
