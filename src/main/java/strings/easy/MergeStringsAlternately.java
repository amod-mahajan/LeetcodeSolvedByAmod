package strings.easy;

// https://leetcode.com/problems/merge-strings-alternately/

public class MergeStringsAlternately {
    public static String mergeAlternately(String word1, String word2) {
        StringBuilder result = new StringBuilder();
        int minLen = Math.min(word1.length(), word2.length());
        for(int i = 0; i< minLen ; i++) {
            result.append(word1.charAt(i)).append(word2.charAt(i));
        }

        // abcd pq  2
//        if(word1.length() > minLen) {
//            result.append(word1.substring(minLen));
//        }
//
//        if(word2.length() > minLen) {
//            result.append(word2.substring(minLen));
//        }

        result.append(word1.substring(minLen)).append(word2.substring(minLen));
        return result.toString();
    }

    public static void main(String[] args) {
        System.out.println(mergeAlternately("abc","pqr")); // apbqcr
        System.out.println(mergeAlternately("ab","pqrs")); // apbqrs
        System.out.println(mergeAlternately("abcd","pq")); // apbqcd
        System.out.println(mergeAlternately("cdf","a")); // cadf
        System.out.println(mergeAlternately("","a")); // a
        System.out.println(mergeAlternately("b","")); // b

        //System.out.println("amod".substring(5));
    }
}
