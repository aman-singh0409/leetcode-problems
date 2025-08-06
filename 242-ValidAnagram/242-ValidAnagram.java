// Last updated: 8/6/2025, 11:52:42 AM
class Solution {
    public boolean isAnagram(String s, String t) {
        ArrayList<Character> list= new ArrayList<>();
        if(s.length()!=t.length()){
            return false;
        }
        for(int i=0;i<s.length();i++){
            list.add(s.charAt(i));
        }
        for(int j=0;j<t.length();j++){
            if(list.contains(t.charAt(j))){
                list.remove(Character.valueOf(t.charAt(j)));
            }
            else{
                return false;
            }
        }
        return list.isEmpty();
    }
}