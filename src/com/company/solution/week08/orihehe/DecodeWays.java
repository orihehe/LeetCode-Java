package com.company.solution.week08.orihehe;

// 91
// O(N)
public class DecodeWays {

    public int numDecodings(String s) {
        int[] dp = new int[s.length() + 1];
        dp[0] = 1;
        for (int i = 1; i <= s.length(); i++) {
            if (isValidNum(Character.getNumericValue(s.charAt(i - 1)))) {
                dp[i] += dp[i - 1];
            }
            if (i >= 2 && s.charAt(i - 2) != '0' && isValidNum(Integer.parseInt(s.substring(i - 2, i)))) {
                dp[i] += dp[i - 2];
            }
        }
        return dp[s.length()];
    }

    private boolean isValidNum(int str) {
        return 1 <= str && str <= 26;
    }
}
