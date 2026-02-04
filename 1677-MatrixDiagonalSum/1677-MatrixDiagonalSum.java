// Last updated: 2/4/2026, 3:29:47 PM
class Solution {
    public int diagonalSum(int[][] mat) {
        int sum=0;
        int a=0,b=0;
        int n=mat.length;
        for(int i=1;i<=n;i++){
            sum+=mat[a][b];
            a++;b++;
        }
        a=0;b=n-1;
        for(int i=1;i<=n;i++){
            if(a!=b) sum+=mat[a][b];
            a++;b--;
        }
        return sum;
    }
}