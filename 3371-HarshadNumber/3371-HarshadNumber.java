// Last updated: 2/4/2026, 3:29:16 PM
class Solution {
    public int sumOfTheDigitsOfHarshadNumber(int x) {
        int sum=0;
        int y=x;
        while(y>0){
           sum+=y%10;
            y/=10;
            
        }
        return (x%sum==0)?sum:-1;

    }
}