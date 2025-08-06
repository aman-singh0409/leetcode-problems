// Last updated: 8/6/2025, 11:54:28 AM
class Solution {
    public int lengthOfLongestSubstring(String s) {
        int left=0;
        int maxLength=0;
        HashSet<Character> character=new HashSet<>();

        for(int i=0;i<s.length();i++){
            while(character.contains(s.charAt(i))){
                character.remove(s.charAt(left));
                left++;
            }
            character.add(s.charAt(i));
            maxLength=Math.max(maxLength, i-left+1);
        }
        return maxLength;
    }
}