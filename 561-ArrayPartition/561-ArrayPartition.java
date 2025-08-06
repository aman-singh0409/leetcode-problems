// Last updated: 8/6/2025, 11:52:22 AM
class Solution {
    public int arrayPairSum(int[] nums) {
        Arrays.sort(nums);
        int result=0;
        for(int i=0;i<nums.length;i+=2){
            result+=nums[i];
        }
        return result;
    }
}