// Last updated: 8/6/2025, 11:52:36 AM
class Solution {
    public int findDuplicate(int[] nums) {
        HashSet<Integer> list=new HashSet<>();
        int result=0;
        for(int i=0;i<nums.length;i++){
            if(list.contains(nums[i])){
                result=nums[i];
            }
            else list.add(nums[i]);
        }
        return result;
    }
}