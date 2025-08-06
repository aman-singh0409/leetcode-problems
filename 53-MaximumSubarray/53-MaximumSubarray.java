// Last updated: 8/6/2025, 11:53:48 AM
class Solution {
    public int maxSubArray(int[] nums) {
        int maxSum=nums[0];
        int currentSum=0;
        for(int i=0;i<nums.length;i++){
            currentSum+=nums[i];
            if(currentSum>maxSum){
                maxSum=currentSum;
            }
            if(currentSum<0){
                currentSum=0;
            }
        }
        return maxSum;
    }
}