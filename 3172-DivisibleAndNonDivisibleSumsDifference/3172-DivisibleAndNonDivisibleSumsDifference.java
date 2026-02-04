// Last updated: 2/4/2026, 3:29:18 PM
class Solution {
    public int differenceOfSums(int n, int m) {
        int s=0,s1=0;
        for(int i=1;i<=n;i++){
            if(i%m!=0){
                
                s+=i;
            }
            else{
                s1+=i;
            }
        }
        return s-s1;
    }
}