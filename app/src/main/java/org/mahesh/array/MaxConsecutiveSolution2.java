package org.mahesh.array;

public class MaxConsecutiveSolution2 {
    public static int findMaxConsecutiveOnes(int[] nums) {
        int count = 0;
        int maxCount = 0;
        for(int i = 0; i < nums.length; i++) {
            if(nums[i] == 1) {
                // Increment the count of 1's by one.
                count += 1;
            } else {
                // Find the maximum till now.
                maxCount = Math.max(maxCount, count);
                // Reset count of 1.
                count = 0;
            }
        }
        return Math.max(maxCount, count);
    }

    public static void main(String[] args) {
        int[] ones_zeros_array =new int[]{1,1,1,0,1,1};
        int maxConsecutiveOnes = findMaxConsecutiveOnes(ones_zeros_array);
        System.out.println(maxConsecutiveOnes);
    }
}
