// Last updated: 8/6/2025, 11:51:14 AM
class Solution {
    public int maximumCount(int[] nums) {
        int pc=0;
        int nc=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]<0){
                nc++;
            }
            else if(nums[i]>0){
                pc++;
            }
        }
        if(pc>=nc){
            return pc;
        }
        else if(pc<nc){
            return nc;
        }
        return 0;
    }
}