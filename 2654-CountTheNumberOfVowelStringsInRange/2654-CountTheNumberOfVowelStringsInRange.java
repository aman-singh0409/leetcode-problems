// Last updated: 8/6/2025, 11:51:11 AM
class Solution {
    public int vowelStrings(String[] words, int left, int right) {
        int count=0;
        for(int i=left;i<=right;i++){
            int start=words[i].charAt(0);
            int end=words[i].charAt(words[i].length()-1);
            if((start=='a'||start=='e'||start=='i'||start=='o'||start=='u')&&(end=='a'||end=='e'||end=='i'||end=='o'||end=='u')){
                count++;
            }
        }
        return count;
    }
}