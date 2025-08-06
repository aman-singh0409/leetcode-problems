// Last updated: 8/6/2025, 11:51:13 AM
class Solution {
    public long coloredCells(int n) {
        if(n==1){
            return 1;
        }
        return 2L*n*(n-1) +1;
    }
}