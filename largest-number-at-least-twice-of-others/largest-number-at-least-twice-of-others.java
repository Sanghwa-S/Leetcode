import java.util.Arrays;
import java.util.Collections;

class Solution {
    public int dominantIndex(int[] nums) {

        int result = 0;
        int resultValue = 0;
        int[] unsortedArray = new int[nums.length];

        for(int i=0; i < nums.length; i++){
            unsortedArray[i] = nums[i];
        }

        Arrays.sort(nums);

        if (nums[nums.length - 1] >= nums[nums.length - 2] * 2)
            resultValue = nums[nums.length - 1];
        else
            return -1;

        for (int i = 0; i < nums.length; i++) {
            if (unsortedArray[i] == resultValue) {
                result = i;
                break;
            }
        }
        return result;
    }
}