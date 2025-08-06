// Last updated: 8/6/2025, 11:51:25 AM
class Solution {
    public List<Integer> findLonely(int[] nums) {
        Map<Integer, Integer> freq=new HashMap<>();
        for(int num:nums){
            freq.put(num,freq.getOrDefault(num,0)+1);
        }
        ArrayList<Integer> res=new ArrayList<>();
        for(int num:nums){
            if(freq.get(num)==1 && !(freq.containsKey(num-1)) && !(freq.containsKey(num+1))){
                res.add(num);
            }
        }
        return res;
    }
}