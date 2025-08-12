// Last updated: 8/12/2025, 3:13:09 PM
class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> ll=new ArrayList<>();
        paranthesis(n,0,0,"",ll);
        return ll;
    }
    public static void paranthesis(int n, int open, int close, String ans, List<String> ll){
        if(open==n&&close==n){
            //System.out.pritnln(ans+" ");
            ll.add(ans);
            return;
        }
        if(open<n){
            paranthesis(n,open+1,close,ans+"(",ll);
        }
        if(close<open){
            paranthesis(n,open,close+1,ans+")",ll);
        }
    }
}