class Solution {
    
    public int gcd(int a,int b){
        int l= Math.max(a,b);
        int s= Math.min(a,b);
        int r= l%s;
        if(r==0){
            return s;
        }
        return gcd(s,r);
    }
    
    public String gcdOfStrings(String str1, String str2) {
        String s1= str1+str2;
        String s2= str2+str1;
        if(!s1.equals(s2)){
            return "";
        }
        int len=gcd(str1.length(),str2.length());
        return str1.substring(0,len);
    }
}