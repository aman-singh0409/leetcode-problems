// Last updated: 8/6/2025, 11:53:12 AM
class Solution {
    public boolean isPalindrome(String s) {
        String st=s.toLowerCase();
        String str= st.replaceAll("[^a-z0-9]","");
        int start=0;
        int end=str.length()-1;
        while(start<end){
            if(str.charAt(start)!=str.charAt(end)){
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
}