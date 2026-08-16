class Solution {
    public String reverseVowels(String s) {
        char ch[]= s.toCharArray();
        int start=0;
        int end= s.length()-1;
        String vowels="aeiouAEIOU";
        while(start<end){
            boolean startVowel=vowels.indexOf(ch[start])!=-1;
            boolean endVowel=vowels.indexOf(ch[end])!=-1;
            if(startVowel && endVowel){
                char temp=ch[start];
                ch[start]=ch[end];
                ch[end]=temp;
                start++;
                end--;
                continue;
            }

            if(!startVowel){
                start++;
            }

            if(!endVowel){
                end--;
            }
        }
        return new String(ch);
    }
}