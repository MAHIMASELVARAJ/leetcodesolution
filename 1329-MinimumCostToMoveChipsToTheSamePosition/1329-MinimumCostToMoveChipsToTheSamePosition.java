// Last updated: 2/4/2026, 3:29:55 PM
class Solution {
    public int minCostToMoveChips(int[] position) {
        int ec=0;
        int oc=0;
        for(int x:position){
            if(x%2==0){
                ec++;
            }
            else{
                oc++;
            }
        }
        return ec<oc?ec:oc;
    }
}