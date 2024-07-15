package strings.easy;

public class CountTheNumberOfConsistentStrings {

    public static int countConsistentStrings(String allowed, String[] words) {
        int counter = 0;
        for(String word : words) {
            boolean flag = true;
            char[] chars = word.toCharArray();
            for(char c : chars) {
                if(allowed.indexOf(c) == -1) {
                    flag = false;
                    break;
                }
            }
            if(flag)
                counter ++;
        }
        return counter;
    }

    public static void main(String[] args) {
        System.out.println(countConsistentStrings("ab", new String[]{"ad","bd","aaab","baa","badab"}));
        System.out.println(countConsistentStrings("abc", new String[]{"a","b","c","ab","ac","bc","abc"}));
        System.out.println(countConsistentStrings("cad", new String[]{"cc","acd","b","ba","bac","bad","ac","d"}));
    }
}
