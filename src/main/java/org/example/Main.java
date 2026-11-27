package org.example;


import java.util.Stack;

public class Main {
    public int longestValidParentheses(String s) {

        Stack<Integer> stack = new Stack<>();
        stack.push(-1);
        int maxLength = 0;

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') {
                stack.push(i);
            } else {
                stack.pop();
                if (stack.isEmpty()) {
                    stack.push(i);
                } else {
                    maxLength = Math.max(maxLength, i - stack.peek());
                }
            }
        }
        return maxLength;
    }


    public static void main(String[] args) {
     Main obj = new Main();

        String s1 = "(()";
        String s2 = ")()())";
        String s3 = "";

        System.out.println("Input: " + s1);
        System.out.println("Output: " + obj.longestValidParentheses(s1));

        System.out.println("Input: " + s2);
        System.out.println("Output: " + obj.longestValidParentheses(s2));

        System.out.println("Input: " + s3);
        System.out.println("Output: " + obj.longestValidParentheses(s3));
    }
}
