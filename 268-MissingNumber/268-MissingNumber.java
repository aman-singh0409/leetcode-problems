// Last updated: 8/6/2025, 11:52:39 AM
class Solution {
    public int missingNumber(int[] nums) {
        int res=nums.length;
        for(int i=0;i<nums.length;i++){
            res+=i-nums[i];
        }
        return res;
    }
}