class Solution {
    public long findKthSmallest(int[] coins, int k) {
        long low = 1;
        long high = (long) getMin(coins) * k;

        while (low < high) {
            long mid = low + (high - low) / 2;

            long count = countNumbers(mid, coins, k);

            if (count < k) {
                low = mid + 1;
            } else {
                high = mid;
            }
        }

        return low;
    }

    private long countNumbers(long x, int[] coins, long k) {
        int n = coins.length;
        long count = 0;

        // Every non-empty subset of coins
        for (int mask = 1; mask < (1 << n); mask++) {
            long lcm = 1;
            int selected = 0;

            for (int i = 0; i < n; i++) {
                // Check if coin i is present in this subset
                if ((mask & (1 << i)) != 0) {
                    selected++;

                    lcm = lcm(lcm, coins[i]);

                    // No multiple of this LCM can be <= x
                    if (lcm > x) {
                        break;
                    }
                }
            }

            if (lcm > x) {
                continue;
            }

            long multiples = x / lcm;

            if (selected % 2 == 1) {
                count += multiples;
            } else {
                count -= multiples;
            }

        }

        return count;
    }

    private long gcd(long a, long b) {
        while (b != 0) {
            long temp = a % b;
            a = b;
            b = temp;
        }
        return a;
    }

    private long lcm(long a, long b) {
        return (a / gcd(a, b)) * b;
    }

    private int getMin(int[] coins) {
        int min = coins[0];

        for (int coin : coins) {
            min = Math.min(min, coin);
        }

        return min;
    }
}