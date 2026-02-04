// Last updated: 2/4/2026, 3:29:57 PM
class Solution {
    public int tribonacci(int n) {
        if(n==0 || n==1) return n;
        if(n==2) return 1;
        int x=0,y=1,z=1,nxt=0;
        for(int i=1;i<=n-2;i++){
            nxt=x+y+z;
            x=y;
            y=z;
            z=nxt;
        }
        return nxt;
    }
}