// Last updated: 2/4/2026, 3:29:45 PM
class Solution {
    public int arraySign(int[] nums) {
        int c=1;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0) return 0;
            if(nums[i]<0)  c=-c;
        }
        return c;
    }
}