class Solution {
    public int[] resultArray(int[] nums) {
        int len= nums.length;
        List<Integer> n= new ArrayList<>();
        List<Integer> m= new ArrayList<>();
        n.add(nums[0]);
        m.add(nums[1]);
        int[] result= new int[len];
        for(int i=2;i<nums.length;i++){
            if(n.get(n.size()-1)>m.get(m.size()-1)){
                n.add(nums[i]);
            }else{
                m.add(nums[i]);
            }
        }
        int counter=0;
        for(int i=0;i<n.size();i++){
            result[i]=n.get(i);
            counter++;
        }
        for(int i=0;i<m.size() && counter<result.length;i++){
            result[counter]=m.get(i);
            counter++;
        }

        return result;
    }
}