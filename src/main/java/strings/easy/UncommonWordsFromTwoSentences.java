package strings.easy;

import java.util.*;

// https://leetcode.com/problems/uncommon-words-from-two-sentences/description/

public class UncommonWordsFromTwoSentences {

    public static String[] uncommonFromSentences(String s1, String s2) {
        // A map to store the occurance of each word from both the sentences
        HashMap<String,Integer> counts = new HashMap<>();
        // Concatenate both strings
        String combinedSentence = s1 + " " + s2;
        // Iterate combined sentence word by word and store counts
        for(String word : combinedSentence.split(" ")) {
            counts.put(word, counts.getOrDefault(word, 0) + 1);
        }
        // A list to store uncommon words
        List<String> uncommonWords = new ArrayList<>();
        // Iterate map to filter words with value or occurrence as one
        for(Map.Entry<String, Integer> keyValuePair : counts.entrySet()) {
            // get the value and equal to 1
            if(keyValuePair.getValue() == 1)
                // add to list if value is 1
                uncommonWords.add(keyValuePair.getKey());
        }
        // Converting List<String> to String[]
        String[] resultArray = new String[uncommonWords.size()];
        resultArray = uncommonWords.toArray(resultArray);
        return resultArray;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(uncommonFromSentences("this apple is sweet", "this apple is sour")));
        System.out.println(Arrays.toString(uncommonFromSentences("apple apple", "banana")));
    }
}
