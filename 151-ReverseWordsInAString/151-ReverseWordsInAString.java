// Last updated: 8/6/2025, 11:53:07 AM
class Solution {
    public String reverseWords(String s) {
        String words[]=s.trim().split("\\s+");
        StringBuilder str= new StringBuilder();
        for(int i=words.length-1;i>=0;i--){
            str.append(words[i]).append(" ");
        }
        return str.toString().trim();
    }
}