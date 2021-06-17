package com.company.solution.week13.orihehe;

// 238
// O(N)
public class ProductOfArrayExceptSelf {

    public int[] productExceptSelf(int[] nums) {
        int[] prefix = new int[nums.length + 2];
        int[] suffix = new int[nums.length + 2];
        int[] ans = new int[nums.length];

        prefix[0] = 1; prefix[nums.length + 1] = 1;
        suffix[0] = 1; suffix[nums.length + 1] = 1;

        for (int i = 1; i < nums.length + 1; i++) {
            prefix[i] = prefix[i - 1] * nums[i - 1];
        }
        for (int i = nums.length; i > 0; i--) {
            suffix[i] = suffix[i + 1] * nums[i - 1];
        }
        for (int i = 0; i < nums.length; i++) {
            ans[i] = prefix[i] * suffix[i + 2];
        }
        return ans;
    }
}