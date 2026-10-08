class Solution {
    public int maxSubArray(int[] nums) {
        int maxsum=nums[0],currentsum=0;
      for(int i=0;i<nums.length;i++){
        //for(int j=0;)
        currentsum=Math.max(nums[i],currentsum+nums[i]);
        maxsum=Math.max(maxsum,currentsum);

      }
      return maxsum;
    }
}