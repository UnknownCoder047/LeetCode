class Solution {
    public boolean checkDivisibility(int n) {
        long sum=0;
        long prod=1;
        int r;
        int d=n;

        while(d>0){
            r= d%10;
            sum+=r;
            prod*=r;
            d=d/10;
        }
        return n%(sum+prod)==0; 
    }
}