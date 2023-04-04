package strings.easy;

// https://leetcode.com/problems/sorting-the-sentence/

import java.util.ArrayList;
import java.util.List;

public class SortingTheSentence {

    // Using Array
    public static String sortSentence(String sentence) {
        // Splt sentence to get words
        String[] words = sentence.split(" ");
        // Create an array of same length as words count
        String[] wordsWithCorrectPosition = new String[words.length];
        // Iterate word by word
        for(String word : words) {
            // Extract last char from word
            int index = Character.getNumericValue(word.charAt(word.length() - 1));
            // Insert word at its correct position in array
            wordsWithCorrectPosition[index - 1] = word.substring(0, word.length()-1);
        }
        // Join all words of array with whitespace as delimiter
        return String.join(" ", wordsWithCorrectPosition);
    }

    // Using ArrayList
    public static String sortSentenceWithArrayList(String sentence) {
        // Splt sentence to get words
        String[] words = sentence.split(" ");
        // Create a new ArrayList from above array
        ArrayList<String> wordsList = new ArrayList<>(List.of(words));
        // Iterate word by word
        for(String word : words) {
            // Extract last char from word
            int index = Character.getNumericValue(word.charAt(word.length() - 1));
            // Replace word at its correct position in ArrayList
            wordsList.set(index - 1, word.substring(0, word.length()-1));
        }
        // Join all words of array with whitespace as delimiter
        return String.join(" ", wordsList);
    }

    public static void main(String[] args) {
        System.out.println(sortSentence("is2 sentence4 This1 a3"));
        System.out.println(sortSentence("Myself2 Me1 I4 and3"));
        System.out.println(sortSentenceWithArrayList("is2 sentence4 This1 a3"));
        System.out.println(sortSentenceWithArrayList("Myself2 Me1 I4 and3"));
    }
}
