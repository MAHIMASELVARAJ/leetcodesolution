// Last updated: 2/4/2026, 3:30:09 PM
class Solution {
    public boolean isPowerOfFour(int n){    
        return (n&(n-1)) == 0 && n%3 ==1;
    }
}