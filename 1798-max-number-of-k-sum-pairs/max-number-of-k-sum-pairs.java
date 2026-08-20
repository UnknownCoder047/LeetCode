class Solution {
    public int maxOperations(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        int operations = 0;

        for (int num : nums) {
            int complement = k - num;

            // Check if the matching pair exists in the map
            if (map.getOrDefault(complement, 0) > 0) {
                operations++;
                // Use up one instance of the complement
                map.put(complement, map.get(complement) - 1);
            } else {
                // No match found yet, track the current number
                map.put(num, map.getOrDefault(num, 0) + 1);
            }
        }

        return operations;
    }
}