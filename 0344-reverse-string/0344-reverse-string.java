class Solution {
    public void reverseString(char[] s) {
        int k=s.length-1;
        int i=0;
        while(i<=k){
            char temp =s[i];
            s[i]=s[k];
            s[k]=temp;
            i++;
            k--;
        }
    }
}
