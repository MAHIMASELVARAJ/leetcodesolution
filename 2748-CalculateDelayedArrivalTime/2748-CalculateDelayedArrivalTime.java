// Last updated: 2/4/2026, 3:29:25 PM
class Solution {
    public int findDelayedArrivalTime(int arrivalTime, int delayedTime) {
        int sum = arrivalTime+delayedTime;
        
        if(sum>=24) return sum%24;
        else return sum;
        
    }
}