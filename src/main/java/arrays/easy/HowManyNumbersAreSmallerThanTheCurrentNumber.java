package arrays.easy;

import java.util.Arrays;

public class HowManyNumbersAreSmallerThanTheCurrentNumber {
    public static int[] smallerNumbersThanCurrent(int[] nums) {
        int[] resultArray = new int[nums.length];
        for(int i = 0 ; i< nums.length ; i++) {
            int current = nums[i];
            int count = 0;
            for(int j = 0; j<nums.length ; j++) {
                if (i != j && nums[j] < current)
                    count++;
            }
            resultArray[i] = count;
        }
        return resultArray;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(smallerNumbersThanCurrent(new int[] {8,1,2,2,3})));
    }
}
