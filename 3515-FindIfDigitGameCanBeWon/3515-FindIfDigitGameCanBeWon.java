// Last updated: 2/4/2026, 3:29:13 PM
class Solution {
    public boolean canAliceWin(int[] nums) {
        
        int sd=0,dd=0;
        for(int i=0;i<=nums.length-1;i++){
            if(nums[i]<10){
                sd+=nums[i];
            }
            else{
                dd+=nums[i];
            }
        }
        return (sd!=dd)?true:false;
    }
}