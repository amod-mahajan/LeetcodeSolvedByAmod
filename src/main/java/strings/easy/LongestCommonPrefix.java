package strings.easy;

import java.util.ArrayList;
import java.util.HashSet;

public class LongestCommonPrefix {

    public static String longestCommonPrefix(String[] strs) {
        // StringBuilder will help to manipulate string efficiently
        StringBuilder result = new StringBuilder();
        // Counter to find the maximum iteration with common prefix
        int counter = 0;
        // flag to continue or break iteration
        boolean flag = true;
        while(flag) {
            // will extract char from each word and add in to set - does not allow duplicate
            HashSet<String> areSame = new HashSet<>();
            // iterate words of array
            for (String str : strs) {
                // check the length of string greater than counter
                if (str.length() > counter) {
                    // extract the char and add to set
                    areSame.add(String.valueOf(str.charAt(counter)));
                    // if size of set is not 1 then we do not have common char. Break the loop
                    if (areSame.size() > 1) {
                        flag = false;
                        break;
                    }
                //if the length of string is not greater than counter then break loop
                } else {
                    flag = false;
                    break;
                }
            }
            // if flag remains true after iteration then append the common char i.e. element in set to result
            if(flag) {
                    result.append(new ArrayList<>(areSame).get(0));
                    counter ++;
                }
        }
        // Convert StringBuilder to string
        return result.toString();
    }

    public static void main(String[] args) {
        System.out.println(longestCommonPrefix(new String[] {"flower","flow","flight"})); // fl
        System.out.println(longestCommonPrefix(new String[] {"","b"})); // ""
        System.out.println(longestCommonPrefix(new String[] {"ab", "a"})); // a
    }
}
