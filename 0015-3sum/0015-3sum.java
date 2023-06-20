class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Set<List<Integer>> set=new HashSet<>();
        if(nums.length==0) return new ArrayList<>();
        Arrays.sort(nums);
        int sum=0;
        for(int i=0;i<nums.length-2;i++)
        {
            int j=i+1;
            int k=nums.length-1;
            while(j<k)
            {
                sum=nums[i]+nums[j]+nums[k];
                if(sum==0) set.add(Arrays.asList(nums[i],nums[j++],nums[k--]));
                if(sum<0) j++;
                if(sum>0) k--;

            }
        }
        return new ArrayList<>(set);
    }
}



//Time Limit Exceeded
// class Solution {
//     public List<List<Integer>> threeSum(int[] nums) {
//         Arrays.sort(nums);
//         ArrayList<List<Integer>> ret = new ArrayList<List<Integer>>();
//         int length = nums.length;
        
//         for(int i=0; i < length-2; i++){
//             for(int j=i+1; j < length-1; j++) {
//                 for(int k=j+1; k < length; k++ ){
//                     if(nums[i] + nums[j] + nums[k] == 0){
//                         List<Integer> out = new ArrayList<Integer>();
//                         out.add(nums[i]);
//                         out.add(nums[j]);
//                         out.add(nums[k]);
//                         Collections.sort(out);
//                         boolean isDuplcated = false;
                        
//                         for(List<Integer> prev : ret){
//                             if(prev.get(0)==out.get(0) && prev.get(1)==out.get(1) && prev.get(2)==out.get(2)){
//                                 isDuplcated = true;
//                                 break;
//                             }
//                         }
                        
//                         if(!isDuplcated){
//                                 ret.add(out);
//                         }
//                     }
//                 }
//             }
//         }
        
//         return ret;
//     }
// }