package strings.easy;

// https://leetcode.com/problems/make-the-string-great/description/

import java.util.Stack;

public class MakeTheStringGreat {

    public static String makeGood(String s) {
        Stack<Character> stack = new Stack<>();
        char[] chars = s.toCharArray();
        for(char current : chars) {
            if(stack.size() == 0)
                stack.push(current);
            else {
                char top = stack.peek();
                if(Character.toUpperCase(current) == Character.toUpperCase(top)) {
                    // aA, Aa, aa, AA
                    if(Character.isUpperCase(current) && Character.isLowerCase(top) ||
                    Character.isUpperCase(top) && Character.isLowerCase(current)) {
                        stack.pop();
                    }
                    else {
                        stack.push(current);
                    }
                }
                else {
                    stack.push(current);
                }
            }
        }

        StringBuilder result = new StringBuilder();
        while(stack.size() != 0){
            result.append(stack.pop());
        }
        return result.reverse().toString();
    }

    public static void main(String[] args) {
        System.out.println(makeGood("leEeetcode"));
        System.out.println(makeGood("abBAcC"));
        System.out.println(makeGood("s"));
    }
}
