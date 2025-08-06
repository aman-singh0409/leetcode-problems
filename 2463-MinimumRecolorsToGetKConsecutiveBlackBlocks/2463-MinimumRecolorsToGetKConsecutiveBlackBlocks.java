// Last updated: 8/6/2025, 11:51:22 AM
class Solution {
        public int minimumRecolors(String blocks, int k) {
                int blackCount = 0, ans = Integer.MAX_VALUE;
                    
                            for (int i = 0; i < blocks.length(); i++) {
                                        if (i - k >= 0 && blocks.charAt(i - k) == 'B') blackCount--;
                                                    if (blocks.charAt(i) == 'B') blackCount++;
                                                                ans = Math.min(ans, k - blackCount);
                                                                        }
                                                                                
                                                                                        return ans;
                                                                                            }
                                                                                            }
