// Last updated: 8/6/2025, 11:52:52 AM
class Solution {
    public int minSubArrayLen(int target, int[] nums) {
       int minLen= Integer.MAX_VALUE;
       int j=0;
       int sum=0;

       for(int i=0;i<nums.length;i++){
        sum+=nums[i];
        while(sum>=target){
            if(i-j+1<minLen){
                minLen=i-j+1;
            }
            sum-=nums[j];
            j++;
        }
       } 
       return minLen!=Integer.MAX_VALUE ? minLen : 0;
    }
}