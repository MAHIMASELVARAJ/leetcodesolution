// Last updated: 2/4/2026, 3:29:30 PM
class Solution {
    public int passThePillow(int n, int time) {
        int pass = time/(n-1);
        return pass % 2 == 0?(time%(n-1)+1):(n-time%(n-1));
    }
}