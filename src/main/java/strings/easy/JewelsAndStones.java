package strings.easy;

import java.util.HashMap;
// https://leetcode.com/problems/jewels-and-stones/
public class JewelsAndStones {

    public static int numJewelsInStones(String jewels, String stones) {
        // A map to store count of each jewels in stones i.e. store occurrence of each char in stones
        HashMap<Character, Integer> charCounts = new HashMap<>();
        // Iterate char by char and store in map
        for(char c : stones.toCharArray())
            charCounts.put(c, charCounts.getOrDefault(c, 0) + 1);
        // Variable to count jewels in stones
        int count = 0;
        // Iterate char by char in jewels and get the value from map
        for(char c : jewels.toCharArray())
            // add values for each char
            count +=  charCounts.getOrDefault(c, 0);
        // return count
        return count;
    }

    public static void main(String[] args) {
        System.out.println(numJewelsInStones("aA","aAAbbbb"));
        System.out.println(numJewelsInStones("z","ZZ"));
    }
}
