package arrays.easy;

public class CheckIfTwoStringArraysAreEquivalent {
    public static boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        StringBuilder w1 = new StringBuilder();
        StringBuilder w2 = new StringBuilder();
        for(String word : word1)
            w1.append(word);
        for(String word : word2)
            w2.append(word);
        return w1.toString().equals(w2.toString());

    }

    public static void main(String[] args) {
        System.out.println(arrayStringsAreEqual(new String[]{"ab","c"}, new String[]{"a","bc"}));
    }
}
