class Solution {
    public boolean isSubsequence(String s, String t) {
        char[] sChar=s.toCharArray();
        char[] tChar=t.toCharArray();
        int count=0;
        int i=0;
        int j=0;
        while(i<tChar.length){
            if(j==sChar.length){
                break;
            }
            if(sChar[j]==tChar[i]){
                count++;
                j++;
            }
            i++;
        }
        return count==sChar.length;
    }
}