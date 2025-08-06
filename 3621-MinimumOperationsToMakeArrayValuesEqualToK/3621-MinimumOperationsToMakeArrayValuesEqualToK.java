// Last updated: 8/6/2025, 11:50:43 AM
class Solution {

    public int minOperations(int[] nums, int k) {
        Set<Integer> st = new HashSet<>();
        for (int x : nums) {
            if (x < k) {
                return -1;
            } else if (x > k) {
                st.add(x);
            }
        }
        return st.size();
    }
}