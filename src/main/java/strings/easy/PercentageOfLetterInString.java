package strings.easy;

// https://leetcode.com/problems/percentage-of-letter-in-string/

/*
Logic -
s = "foobar", letter = "o"
2/6 * 100 = 0.33333 * 100 = 33%
 */

public class PercentageOfLetterInString {

    public static int percentageLetter(String s, char letter) {
        int counter = 0;
//        char[] sChars = s.toCharArray();
//        for(char c: sChars) {
//            if(c == letter)
//                counter ++;
//        }

        counter = (int) s.chars().filter(c -> c==letter).count();
        // cast int to double before division not to loose decimal points
        double percetage = ((double)counter / (double)s.length() ) * 100;
        return (int)Math.floor(percetage);

    }

    public static void main(String[] args) {
        System.out.println(percentageLetter("foobar", 'o'));
        System.out.println(percentageLetter("jjjj", 'k'));
        System.out.println(percentageLetter("a", 'a'));
    }
}
