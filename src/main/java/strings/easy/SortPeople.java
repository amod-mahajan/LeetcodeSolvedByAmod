package strings.easy;

import java.util.*;

public class SortPeople {
    public static String[] sortPeople(String[] names, int[] heights) {
        // A map to store mapping or person and their heights
        // Since heights are unique so use heights as key
        HashMap<Integer, String> mapping = new HashMap<>();
        // Iterate both arrays simultaneously to store mapping
        for(int i =0; i<names.length ; i++) {
            mapping.put(heights[i], names[i]);
        }
        // Get all height values
        ArrayList<Integer> allHeights = new ArrayList<>(mapping.keySet());
        // Sort the keys or heights in decending order
        allHeights.sort(Collections.reverseOrder());
        // A string array to store people's name as per sorted heights
        String[] result = new String[names.length];
        // Iterate sorted height array
        for(int j =0; j< allHeights.size() ; j++) {
            // get people's name as per height from map
            result[j] = mapping.get(allHeights.get(j));
        }
        // return result
        return result;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(sortPeople(new String[]{"Mary", "John", "Emma"}, new int[]{180, 165, 170})));
        System.out.println(Arrays.toString(sortPeople(new String[]{"Alice","Bob","Bob"}, new int[]{155,185,150})));
    }
}
