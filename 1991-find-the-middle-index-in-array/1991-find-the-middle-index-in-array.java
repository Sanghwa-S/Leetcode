class Solution {
    public int findMiddleIndex(int[] nums) {
        int sum = 0;
        int sumLeft = 0;
        
        for(int i : nums)
            sum += i;
        
        int sumRight = sum;
        
        for(int j=0; j < nums.length; j++){
            sumRight -= nums[j];
            if(sumRight == sumLeft)
                return j;
            sumLeft += nums[j];
        }
        return -1;
    }
}