package strings.easy;

// https://leetcode.com/problems/make-the-string-great/description/

import java.util.Stack;

public class MakeTheStringGreat {

    public static String makeGood(String s) {
        // A stack which supports LIFO - Last In First Out
        Stack<Character> stack = new Stack<>();
        // Iterate string char by char
        for(char current : s.toCharArray()) {
            // if stack size is zero then push the current char
            if(stack.size() == 0)
                stack.push(current);
            else {
                // if stack as element or size is not zero then peek/get the last element
                char top = stack.peek();
                // Checking if last char in stack and current char in iteration are same ignoring their case
                if(Character.toUpperCase(current) == Character.toUpperCase(top)) {
                    // if both are same then check if one is in upper case and another lower case or vice versa
                    if(Character.isUpperCase(current) && Character.isLowerCase(top) ||
                    Character.isUpperCase(top) && Character.isLowerCase(current)) {
                        // if yes then remove last char from stack
                        stack.pop();
                    }
                    else {
                        // if no then push in to stack
                        stack.push(current);
                    }
                }
                else {
                    // if last char in stack and current char in iteration are not same then push in to stack
                    stack.push(current);
                }
            }
        }

        // Create string from chars in stack
        StringBuilder result = new StringBuilder();
        while(stack.size() != 0){
            result.append(stack.pop());
        }
        // since stack is LIFO so chars will be in reverse order
        return result.reverse().toString();
    }

    public static void main(String[] args) {
        System.out.println(makeGood("leEeetcode"));
        System.out.println(makeGood("abBAcC"));
        System.out.println(makeGood("s"));
    }
}
