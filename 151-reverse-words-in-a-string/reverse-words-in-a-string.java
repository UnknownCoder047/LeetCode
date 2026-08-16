class Solution {
    public String reverseWords(String s) {
        String result="";
        s= s.strip().replaceAll("\\s+", " ");
        String[] words= s.split(" ");
        for(int i=words.length-1;i>=0;i--){
            result+=words[i]+" ";
        }
        result=result.trim();
        return result;
    }
}