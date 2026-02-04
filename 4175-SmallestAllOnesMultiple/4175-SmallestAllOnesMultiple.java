// Last updated: 2/4/2026, 3:29:08 PM
class Solution {
    public int minAllOneMultiple(int k) {
        int t=k;
        if(k%2==0 || k%5==0) return -1;
        int rem=0;
        for(int l=1;l<=k;l++){
            rem=(rem*10+1)%k;
            if(rem==0){
                return l;
            }
        }
        return -1;
    }
}