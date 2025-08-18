// Last updated: 8/18/2025, 7:54:14 PM
class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int count=0;
        int count2=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==1){
                count++;
            }
            else{
                if(count2<count){
                    count2=count;
                }
                count=0;
            }
        }
        if(count2>count){
            return count2;
        }
        else{
            return count;
        }
    }
}