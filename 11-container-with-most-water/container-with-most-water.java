class Solution {
    public int maxArea(int[] height) {
        int maxArea=0;
        int i=0;
        int j=height.length-1;
        int area;
        while(i<j){
            area=(j-i)*Math.min(height[i],height[j]);
            maxArea=Math.max(area,maxArea);
            if(height[i]<height[j]){
                i++;
            }else{
                j--;
            }
        }
        return maxArea;
    }
}