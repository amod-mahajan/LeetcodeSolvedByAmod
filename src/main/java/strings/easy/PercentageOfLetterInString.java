package strings.easy;

// https://leetcode.com/problems/percentage-of-letter-in-string/

public class PercentageOfLetterInString {

    public static int percentageLetter(String s, char letter) {
        // Get the length of string
        int totalChars = s.length();
        int count = 0;
        // Iterate chars and increment counter if char is found
//        for(char c : s.toCharArray()) {
//            if(c == letter)
//                count ++;
//        }
        // Using stream
        count = (int) s.chars().filter(c -> c == letter).count();
        // We need to cast int to double
        double per = ((double) count / (double) totalChars)* 100;
        // We need to do round down
        return (int) Math.floor(per);
    }

    public static void main(String[] args) {
        System.out.println(percentageLetter("foobar", 'o'));
        System.out.println(percentageLetter("jjjj", 'k'));
    }
}
