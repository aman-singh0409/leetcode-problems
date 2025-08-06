// Last updated: 8/6/2025, 11:51:37 AM
class Solution {
    public boolean areAlmostEqual(String s1, String s2) {
        if(s1.length()!=s2.length()){
            return false;
        }
        else if(s1.equals(s2)){
            return true;
        }
        ArrayList<Integer> idx= new ArrayList<>();
        int size= s1.length();
        for(int i=0;i<size;i++){
            if(s1.charAt(i)!=s2.charAt(i)){
                idx.add(i);
            }
        }
        if(idx.size()!=2){
            return false;
        }
        int idx1=idx.get(0);
        int idx2=idx.get(1);
        if(s1.charAt(idx1)== s2.charAt(idx2) && s1.charAt(idx2)==s2.charAt(idx1)){
            return true;
        }
        return false;
    }
}