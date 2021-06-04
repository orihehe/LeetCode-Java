package com.company.solution.week12.orihehe;

// 125
// O(N)
public class ValidPalindrome {

    public boolean isPalindrome(String s) {
        s = s.replaceAll("[^A-Za-z0-9]", "").toLowerCase();
        int l = 0, r = s.length() - 1;
        while (l < r) {
            if (s.charAt(l) != s.charAt(r))
                return false;
            l++; r--;
        }
        return true;
    }
}
