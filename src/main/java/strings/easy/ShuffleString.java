package strings.easy;

// https://leetcode.com/problems/shuffle-string/description/
public class ShuffleString {
    public static String restoreString(String s, int[] indices) {
        // Create a char array with length equal to string
        char[] resultArray = new char[s.length()];
        // Convert string to char array to iterate char by char
        char[] charsInWords = s.toCharArray();
        // Iterate char array
        for(int i = 0; i<charsInWords.length ;i++) {
            // insert into result array based on correct index of char as per indices
            resultArray[indices[i]] = charsInWords[i];
        }
        // convert and return char array to string
        return new String(resultArray);
    }

    public static void main(String[] args) {
        System.out.println(restoreString("codeleet", new int[] {4,5,6,7,0,2,1,3}));
        System.out.println(restoreString("abc", new int[] {0,1,2}));
    }
}
