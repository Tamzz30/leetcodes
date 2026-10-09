class Solution {
    public boolean isPalindrome(String s) {
        String ans="";
        //int j=s.length();
       // Character.toLowerCase(s);
      s= s.toLowerCase();
       // char[] result=s.toCharArray();
        for(char i:s.toCharArray()){
            if(Character.isLetterOrDigit(i)){
                ans+=i;
            }
        }
        int i=0;
        int j=ans.length()-1;
        while(i<j){
            if(ans.charAt(i)!=ans.charAt(j)) {return false;}
            i++;
            j--;
        }
        return true;
    }
}