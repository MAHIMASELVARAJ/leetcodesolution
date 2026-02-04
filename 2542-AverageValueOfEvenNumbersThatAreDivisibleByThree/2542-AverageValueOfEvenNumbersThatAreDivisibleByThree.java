// Last updated: 2/4/2026, 3:29:37 PM
class Solution {
    public int averageValue(int[] nums) {
        int c=0,s=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]%6==0){
                s+=nums[i];
                c++;
            }
        }
        return (c==0)?0:s/c;

    }
}