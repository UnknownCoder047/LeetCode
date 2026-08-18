class Solution {
    public int largestInteger(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        int result = -1;
        for (int i = 0; i <= nums.length - k; i++) {
            Set<Integer> uniqueInWindow = new HashSet<>();
            for (int j = i; j < i + k; j++) {
                uniqueInWindow.add(nums[j]);
            }
            // Increment each unique number in this window by 1
            for (int val : uniqueInWindow) {
                map.merge(val, 1, Integer::sum);
            }
        }
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() == 1) {
                result = Math.max(result, entry.getKey());
            }
        }
        return result;
    }
}