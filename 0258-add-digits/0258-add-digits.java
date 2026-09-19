class Solution {
    public int addDigits(int num) {
        int temp=num;
        while(temp%10!=temp){
            int sum=0;
            while(temp!=0){
            int rem= temp%10;
            sum+=rem;
            temp= temp/10;
        }
        temp=sum;
    }
    return temp;
}
}