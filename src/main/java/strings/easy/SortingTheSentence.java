package strings.easy;

// https://leetcode.com/problems/sorting-the-sentence/

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SortingTheSentence {

    public static String sortSentence(String sentence) {
        // Get all words from sentence
        String[] words = sentence.split(" ");
        // Create a List from the words
        List<String> listOfWords = Arrays.asList(words);
        // This is required to replace value in List. List created using Arrays.asList will be unmodified.
        List<String> arraylist = new ArrayList<>(listOfWords);
        // Iterate to extract index value and replace word without number in List
        for(String word : words) {
            int index = Character.getNumericValue(word.charAt(word.length() - 1));
            arraylist.set(index-1, word.substring(0, word.length()-1));
        }
        // Join words to form a sentence
        return String.join(" ", arraylist);
    }

    public static void main(String[] args) {
        System.out.println(sortSentence("is2 sentence4 This1 a3"));
        System.out.println(sortSentence("Myself2 Me1 I4 and3"));
    }
}
