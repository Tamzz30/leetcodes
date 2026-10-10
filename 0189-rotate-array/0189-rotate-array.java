class Solution {
    public void rotate(int[] nums, int k) {
        int end=nums.length;
        k=k%(nums.length);
      int[] temp=new int[end];
      int ind=0;
      for(int i=end-k;i<end;i++){
        temp[ind++]=nums[i];
      }
       for(int i=0;i<end-k;i++){
        temp[ind++]=nums[i];
      }
      for(int i=0;i<end;i++){
        nums[i]=temp[i];
      }

    }
}