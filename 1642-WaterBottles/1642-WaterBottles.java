// Last updated: 2/4/2026, 3:29:48 PM
class Solution {
    public int numWaterBottles(int nb, int ne) {
        int drink=nb;
        int empty=nb;
        while(empty>=ne){
            int newd=empty/ne;
            empty=(empty%ne)+newd;
            drink+=newd;
        }
        return drink;
    }
}