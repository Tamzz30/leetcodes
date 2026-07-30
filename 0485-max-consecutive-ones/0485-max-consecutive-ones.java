class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int count=0,temp=0;
        for(int i:nums){
            if(i==1){
                //temp=count;
      count++;
            }
            else{
               temp=Math.max(temp,count);
               count=0;
            }
        }
         temp = Math.max(temp, count);
         return temp;
    
    }
}
