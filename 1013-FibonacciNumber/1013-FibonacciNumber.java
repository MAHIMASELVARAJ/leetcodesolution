// Last updated: 2/4/2026, 3:30:01 PM
class Solution {
    public int fib(int n) {
        int x=0,y=1,nxt=0;
        if(n==1) return 1;
        for(int i=1;i<n;i++){
            nxt=x+y;
            x=y;
            y=nxt;
        }
        return nxt;
    }
}