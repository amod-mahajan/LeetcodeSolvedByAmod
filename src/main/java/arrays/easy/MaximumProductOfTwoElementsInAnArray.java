package arrays.easy;

public class MaximumProductOfTwoElementsInAnArray {

    public static int maxProduct(int[] nums) {
        int max = 0;
        for(int i = 0 ; i< nums.length ; i++) {
            for(int j = i+1; j< nums.length; j++) {
                int multi = (nums[i] - 1) * (nums[j] - 1);
                if(multi > max)
                    max = multi;
            }
        }
        return max;
    }

    public static void main(String[] args) {
        System.out.println(maxProduct(new int[] {3,4,5,2}));
    }
}
