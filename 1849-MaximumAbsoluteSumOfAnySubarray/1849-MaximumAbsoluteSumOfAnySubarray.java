// Last updated: 8/6/2025, 11:51:42 AM
class Solution {
    public int maxAbsoluteSum(int[] nums) {
        int sum=0;
        int maxSum=0;
        int minSum=0;
        for(int num: nums){
            sum+=num;
            if(sum>maxSum){
                maxSum=sum;
            }
            if(sum<minSum){
                minSum=sum;
            }
        }
        return Math.abs(maxSum-minSum);
    }
}