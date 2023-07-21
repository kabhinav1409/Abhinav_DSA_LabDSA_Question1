package com.balancingbrackets;

import java.util.Stack;

public class BalancedBracketsChecker {

    public static boolean isBalanced(String input) {
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);

            if (ch == '(' || ch == '[' || ch == '{') {
                stack.push(ch);
            } else if (ch == ')' || ch == ']' || ch == '}') {
                if (stack.isEmpty()) {
                    return false;
                }

                char top = stack.pop();

                if ((ch == ')' && top != '(') ||
                    (ch == ']' && top != '[') ||
                    (ch == '}' && top != '{')) {
                    return false;
                }
            }
        }

        return stack.isEmpty();
    }

    public static void main(String[] args) {
        String input1 = "([[{}]])";
        String input2 = "([[{}]]))";

        System.out.println("Sample Input 1:");
        System.out.println(input1);
        if (isBalanced(input1)) {
            System.out.println("The entered String has Balanced Brackets");
        } else {
            System.out.println("The entered String does not contain Balanced Brackets");
        }

        System.out.println("\nSample Input 2:");
        System.out.println(input2);
        if (isBalanced(input2)) {
            System.out.println("The entered String has Balanced Brackets");
        } else {
            System.out.println("The entered String does not contain Balanced Brackets");
        }
    }
}
