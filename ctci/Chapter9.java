public class Chapter9 {

    // 9.1
    public int countWays(int n) {
        int mod = 1000000007;
        int[] dp = new int[3];
        dp[0] = 1;
        for (int i = 1; i <= n; ++i) {
            dp[i % 3] = ((dp[(i + 2) % 3] 
                        + dp[(i + 1) % 3]) % mod 
                        + dp[i % 3]) % mod;
        }
        return dp[n % 3];
    }

    // 9.2
    public int countWays(int x, int y) {
        int[] dp = new int[y];
        for (int i = 0; i < x; ++i) {
            for (int j = 0; j < y; ++j) {
                if (i == 0 || j == 0) {
                    dp[j] = 1;
                } else {
                    dp[j] += dp[j - 1];
                }
            }
        }
        return dp[y - 1];
    }

}