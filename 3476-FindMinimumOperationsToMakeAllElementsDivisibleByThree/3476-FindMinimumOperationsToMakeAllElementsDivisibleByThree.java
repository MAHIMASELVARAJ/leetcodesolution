// Last updated: 2/4/2026, 3:29:15 PM
class Solution {
    public int minimumOperations(int[] nums) {
        int r=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]%3!=0) r++;
        }
        return r;
    }
}