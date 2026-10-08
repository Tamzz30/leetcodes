class Solution {
    public boolean isPalindrome(int x) {
        if(x<0) return false;
        int original=x,rev=0;
        while(original!=0){
            int digit=original%10;
            rev=rev*10+digit;
            original=original/10;
        }
        return x==rev;
    }
}