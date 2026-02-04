// Last updated: 2/4/2026, 3:30:27 PM
class Solution {
    public void sortColors(int[] nums) {
        int ZI=0,Ti=nums.length-1,i=0;
        while(i<=Ti){
            if(nums[i] ==0){
                int t=nums[i];
                nums[i++]=nums[ZI];
                nums[ZI++]=t;
            }
            else if(nums[i] == 1) ++i;
            else{
                int t=nums[i];
                nums[i]=nums[Ti];
                nums[Ti--] = t;
            }
        }
    }
}