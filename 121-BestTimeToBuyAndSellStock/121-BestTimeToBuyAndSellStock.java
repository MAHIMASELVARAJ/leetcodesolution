// Last updated: 2/4/2026, 3:30:26 PM
class Solution {
    public int maxProfit(int[] prices) {
        int bp=prices[0];
        int mp=0;
        for(int i=1;i<prices.length;i++){
            int sp=prices[i];
            if(sp>bp){
                int p=sp-bp;
                if(mp<p) mp=p;
            }
            else{
                bp=prices[i];
            }
        }
        return mp;
    }
}