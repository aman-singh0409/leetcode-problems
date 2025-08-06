// Last updated: 8/6/2025, 11:51:23 AM
class Solution {
    public boolean divideArray(int[] nums) {
        HashMap<Integer, Integer> map= new HashMap<>();
        for(int num:nums){
            map.put(num, map.getOrDefault(num,0)+1);
        }
        for(int i :map.values()){
            if(i%2!=0){
                return false;
            }
        }
        return true;
    }
}