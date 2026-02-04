// Last updated: 2/4/2026, 3:29:19 PM
class Solution {
    public int accountBalanceAfterPurchase(int purchaseAmount) {
        if(purchaseAmount%10<5) return 100-(purchaseAmount/10)*10;
        else return 100-((purchaseAmount/10)+1)*10;
    }
}