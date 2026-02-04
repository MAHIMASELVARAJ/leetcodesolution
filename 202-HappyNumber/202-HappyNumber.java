// Last updated: 2/4/2026, 3:30:18 PM
class Solution {
    public boolean isHappy(int n) {
        if(n==1 || n==7) return true;
        else if(n<10) return false;
        else{
            int s=0;
            while(n>0){
                int temp=n%10;
                s+=temp*temp;
                n/=10;
            }
            return isHappy(s);
        }
        
    }
}