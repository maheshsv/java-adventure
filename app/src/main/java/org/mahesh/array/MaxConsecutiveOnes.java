package  org.mahesh.array;
class MaxConsecutiveOnes {
    public static int findMaxConsecutiveOnes(int[] nums) {
        int consecutive_ones = 0;
        int largest_consecutive_ones = 0;
        for (int array_element: nums){
            if(array_element == 1){
                consecutive_ones++;
                if(consecutive_ones > largest_consecutive_ones)
                    largest_consecutive_ones = consecutive_ones;
            }else{
                consecutive_ones=0;
            }
        }
        System.out.println(largest_consecutive_ones);
        return largest_consecutive_ones;
    }

    public static void main(String[] args) {
        int[] ones_zeros_array =new int[]{1,1,1,0,1,1};
        int maxConsecutiveOnes = findMaxConsecutiveOnes(ones_zeros_array);
        System.out.println(maxConsecutiveOnes);
    }
}