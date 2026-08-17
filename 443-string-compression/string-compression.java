class Solution {
    public int compress(char[] chars) {
        int writeIndex = 0; // Where we write the result
        int i = 0;          // Where we read the input
        while (i < chars.length) {
            char currentChar = chars[i];
            int count = 0;
            // Count consecutive occurrences of the current character
            while (i < chars.length && chars[i] == currentChar) {
                count++;
                i++;
            }
            // 1. Write the character
            chars[writeIndex++] = currentChar;
            // 2. Write the count if it's greater than 1
            if (count > 1) {
                // Convert count to string to handle multi-digit counts (like 12 -> '1', '2')
                for (char c : Integer.toString(count).toCharArray()) {
                    chars[writeIndex++] = c;
                }
            }
        }
        // Return the new length of the compressed array
        return writeIndex;
    }
}
