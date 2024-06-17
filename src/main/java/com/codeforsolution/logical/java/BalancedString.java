/**
 * @Author codeforsolution
 * Date: 16-06-2024
 **/
package com.codeforsolution.logical.java;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Stack;

public class BalancedString {

    public static void main(String[] args) {
        String str= "[]{}()";
        // Using Stack
        checkBalanced(str);
        // Using Deque
        boolean balanced = checkBalancedSring(str);
        System.out.println(balanced);

    }

    private static void checkBalanced(String str) {
        Stack<Character> st = new Stack<>();
        for(int i = 0; i < str.length(); i++){
            if(str.charAt(i) == '{' || str.charAt(i) == '[' || str.charAt(i) == '('){
                st.push(str.charAt(i));
            } else if (!st.empty() && ((str.charAt(i) == ']' && st.peek() == '[') ||
                    (str.charAt(i) == '}' && st.peek() == '{') ||
                    (str.charAt(i) == ')' && st.peek() == '('))) {
                st.pop();
            } else{
                st.push(str.charAt(i));
            }
        }

        if(st.empty()){
            System.out.println("Balanced");
        } else{
            System.out.println("Not Balanced");
        }
    }
    private static boolean checkBalancedSring(String str) {

        Deque<Character> characterDeque = new LinkedList<>();
        for (char ch: str.toCharArray()){
            if(ch == '{' || ch == '[' || ch == '('){
                characterDeque.addFirst(ch);
            } else if (!characterDeque.isEmpty()
                    && ((characterDeque.peekFirst() == '{' && ch == '}')
                    || (characterDeque.peekFirst() == '[' && ch == ']')
                    ||(characterDeque.peekFirst() == '(' && ch == ')'))) {
                characterDeque.removeFirst();
            } else {
                return false;
            }
        }
        return characterDeque.isEmpty();
    }
}
