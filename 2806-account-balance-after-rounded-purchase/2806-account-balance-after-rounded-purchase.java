class Solution {
    public int accountBalanceAfterPurchase(int purchaseAmount) {
        int exact =((purchaseAmount+5)/10)*10;
        
        return 100-exact;
    }
}