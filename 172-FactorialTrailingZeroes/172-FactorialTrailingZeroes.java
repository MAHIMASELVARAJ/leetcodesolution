// Last updated: 2/4/2026, 3:30:21 PM
class Solution {
    public int trailingZeroes(int n) {
        if(n<5) return 0;
        int c=0;
        while(n>=5){
            int t=n/5;
            c+=t;
            n=t;
        }
        return c;
    }
}