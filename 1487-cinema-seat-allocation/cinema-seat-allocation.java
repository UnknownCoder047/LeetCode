class Solution {
    public int maxNumberOfFamilies(int n, int[][] reservedSeats) {
        // Step 1: Group the reserved seat columns by their row number
            Map<Integer, Set<Integer>> reservedByRow = new HashMap<>();
            for (int[] seat : reservedSeats) {
                int row = seat[0];
                int col = seat[1];
                reservedByRow.computeIfAbsent(row, k -> new HashSet<>()).add(col);
            }
  
            // Step 2: Any completely empty row can automatically fit 2 groups
            int totalGroups = (n - reservedByRow.size()) * 2;
  
            // Step 3: Check each row that has reservations
            for (Set<Integer> reserved : reservedByRow.values()) {
                // Check if seats 2, 3, 4, 5 are all free
                boolean canFitLeft = !reserved.contains(2) && !reserved.contains(3) 
                                  && !reserved.contains(4) && !reserved.contains(5);
  
                // Check if seats 6, 7, 8, 9 are all free
                boolean canFitRight = !reserved.contains(6) && !reserved.contains(7) 
                                   && !reserved.contains(8) && !reserved.contains(9);
  
                // Check if seats 4, 5, 6, 7 are all free
                boolean canFitMiddle = !reserved.contains(4) && !reserved.contains(5) 
                                    && !reserved.contains(6) && !reserved.contains(7);
  
                // If we can seat both left and right, we get 2 groups
                if (canFitLeft && canFitRight) {
                    totalGroups += 2;
                } 
                // Otherwise, if any of left, right, or middle is free, we get 1 group
                else if (canFitLeft || canFitRight || canFitMiddle) {
                    totalGroups += 1;
                }
            }
  
            return totalGroups;
    }
}