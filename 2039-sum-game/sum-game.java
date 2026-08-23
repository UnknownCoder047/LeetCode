class Solution {
    public boolean sumGame(String num) {
        int n = num.length();

        int leftSum = 0;
        int rightSum = 0;
        int leftQ = 0;
        int rightQ = 0;

        for (int i = 0; i < n / 2; i++) {
            char left = num.charAt(i);
            char right = num.charAt(n - 1 - i);

            if (left == '?') {
                leftQ++;
            } else {
                leftSum += left - '0';
            }

            if (right == '?') {
                rightQ++;
            } else {
                rightSum += right - '0';
            }
        }

        int sumDiff = leftSum - rightSum;
        int qDiff = leftQ - rightQ;

        return sumDiff * 2 != -9 * qDiff;
    }
}