class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        
        for(int i=0; i<nums.length; i++) {
            map.put(nums[i], i);
        }
        
        for(int i=0; i<nums.length; i++) {
            int complement = target - nums[i];
            
            //i 랑 complement 가 같으면 안된다!
            //나중에 i 랑 map.get(complement)를 결과로 리턴해줘야 하기 때문에
            if(map.containsKey(complement) && map.get(complement) != i) {
                return new int[] {i , map.get(complement)};
            }
        }
        
        return null;
    }
}