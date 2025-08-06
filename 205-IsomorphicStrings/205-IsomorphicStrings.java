// Last updated: 8/6/2025, 11:52:55 AM
class Solution {
    public boolean isIsomorphic(String s, String t) {
      HashMap<Character, Integer> ms= new HashMap<>();
      HashMap<Character, Integer> mt= new HashMap<>();
      if(s.length()==t.length()){
        for(int i=0;i<s.length();i++){
            if(!ms.containsKey(s.charAt(i))){
                ms.put(s.charAt(i),i);
            }
            if(!mt.containsKey(t.charAt(i))){
                mt.put(t.charAt(i),i);
            }
            if(!ms.get(s.charAt(i)).equals(mt.get(t.charAt(i)))){
                return false;
            }
        }
      }
      return true;
    }
}