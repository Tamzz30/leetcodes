class Solution {
    public String reverseStr(String s, int k) {
        char[] ans=s.toCharArray();
        for(int i=0;i<s.length();i=i+(k*2)){
            int start=i;
           int end=Math.min(i+k-1,s.length()-1);
            while(start<end){
                char temp= ans[start];
                ans[start]=ans[end];
                ans[end]=temp;
                start++;
                end--;
            }
        }
        return new String(ans);
    }
}