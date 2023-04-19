package strings.easy;

import java.util.Calendar;
import java.util.HashMap;

public class JewelsAndStones {

    public static int numJewelsInStones(String jewels, String stones) {
        int count = 0;
        HashMap<Character, Integer> charCounts = new HashMap();
        for(char c : stones.toCharArray())
            charCounts.put(c, charCounts.getOrDefault(c, 0) + 1);

        for(char c : jewels.toCharArray())
            count +=  charCounts.getOrDefault(c, 0);

        return count;
    }

    public static void main(String[] args) {
        System.out.println(numJewelsInStones("aA","aAAbbbb"));
        System.out.println(numJewelsInStones("z","ZZ"));
    }
}
