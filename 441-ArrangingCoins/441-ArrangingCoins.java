// Last updated: 2/4/2026, 3:30:07 PM
class Solution {
    public int arrangeCoins(int n) {
        int r=1;
        while(n>=r){
            n-=r;
            r++;
        }
        return r-1;
    }
}