// Last updated: 8/6/2025, 11:52:28 AM
class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
       // boolean result= false;
        ArrayList<Character> list=new ArrayList<>();
        char ch[]=magazine.toCharArray();
        char mh[]=ransomNote.toCharArray();
        for(int i=0;i<ch.length;i++){
            list.add(ch[i]);
        }
        for(int j=0;j<mh.length;j++){
            if(list.contains(mh[j])){
                list.remove((Character)mh[j]);      // to remove character once used
            }
            else{
                return false;
            }
        }
        return true;
    }
}