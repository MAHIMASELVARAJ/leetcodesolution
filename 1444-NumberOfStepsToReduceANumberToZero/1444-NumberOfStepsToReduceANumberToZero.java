// Last updated: 2/4/2026, 3:29:53 PM
class Solution {
    public int numberOfSteps(int num) {
        int count=0;
        while(num>0){
            count++;
            if((num & 1)==0){
                num /=2;
            }
            else{
                num -=1;
            }
           
        }
        return count;
        
    }
}