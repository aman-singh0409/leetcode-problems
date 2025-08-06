// Last updated: 8/6/2025, 11:52:01 AM
class Solution {
    public int[] sortedSquares(int[] nums) {
        //Arrays.sort(nums);
        ArrayList<Integer> list=new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            list.add(nums[i]*nums[i]);
        }
        int k=0;
        for(int i=0;i<nums.length;i++){
            nums[k++]=list.get(i);
        }
        Arrays.sort(nums);
        return nums;
    }
}