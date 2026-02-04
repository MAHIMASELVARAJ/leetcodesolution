// Last updated: 2/4/2026, 3:29:10 PM
class Solution {
    public long maximumScore(int[] nums) {
        int n = nums.length;
        long[] pre = new long[n];
        pre[0] = nums[0];
        for(int i=1;i<n;i++){
            pre[i] = pre[i-1]+nums[i];
        }
        int[] suf = new int[n];
        suf[n-1] = nums[n-1];
        for(int i=n-2;i>=0;i--){
            suf[i] = Math.min(suf[i+1],nums[i]);
        }
        long max = Long.MIN_VALUE;
        for(int i=0;i<n-1;i++){
            long sc=pre[i]-suf[i+1];
            if(sc>max){
                max=sc;
            }
        }
        return max;
    }
}