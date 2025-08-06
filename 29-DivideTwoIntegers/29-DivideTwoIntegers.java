// Last updated: 8/6/2025, 11:54:00 AM
class Solution {
    public int divide(int dividend, int divisor) {
        if(dividend==Integer.MIN_VALUE&& divisor==-1){
            return Integer.MAX_VALUE;
        }
        return dividend/divisor;
    }
}