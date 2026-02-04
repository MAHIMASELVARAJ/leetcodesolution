// Last updated: 2/4/2026, 3:30:11 PM
class Solution {
    public int missingNumber(int[] nums) {
        int n=nums.length;
        int s=(n*(n+1))/2;
        int s1=0;
        for(int i=0;i<n;i++){
            s1+=nums[i];
        }
        return s-s1;
    }
}