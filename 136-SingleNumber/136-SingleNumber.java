// Last updated: 2/4/2026, 3:30:23 PM
class Solution {
    public int singleNumber(int[] nums) {
        int r=0;
        for(int num:nums){
            r^=num;
        }
        return r;
    }
}