class Solution {
    public void moveZeroes(int[] nums) {
        int pointer=0;
        int i=0;
        int temp;
        while(i<nums.length){
            if(nums[i]!=0){
                temp=nums[i];
                nums[i]=nums[pointer];
                nums[pointer]=temp;
                pointer++;
            }
            i++;
        }
    }
}