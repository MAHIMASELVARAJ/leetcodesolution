// Last updated: 2/4/2026, 3:29:31 PM
class Solution {
    public int differenceOfSum(int[] nums) {
        int es=0;
        int ds=0;
        for(int i=0;i<nums.length;i++){
            es+=nums[i];
        
            while(nums[i]>0){
               ds+=nums[i]%10; 
               nums[i]/=10;
            }    
        }
        return (es>ds)?es-ds:ds-es;
        
    }
}