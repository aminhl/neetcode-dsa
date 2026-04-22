package org.nexthope.neetcode.twopointers;

public class ValidPalindrome {

    public static boolean isPalindrome(String s) {
        int n = s.length();
        if (n == 1) return true;
        StringBuilder sb = new StringBuilder();
        for (char c : s.toCharArray())
            if (Character.isLetterOrDigit(c))
                sb.append(Character.toLowerCase(c));
        return sb.toString().equals(sb.reverse().toString());
    }

    public static boolean isPalindrome2P(String s) {
        int n = s.length();
        if (n == 1) return true;
        StringBuilder sb = new StringBuilder();
        for (char c : s.toCharArray())
            if (Character.isLetterOrDigit(c))
                sb.append(Character.toLowerCase(c));
        int l = 0, r=sb.length()-1;
        while (l<r) {
            if (sb.charAt(l) != sb.charAt(r)) return false;
            l++;
            r--;
        }
        return true;
    }

    public static boolean isPalindrome2PC(String s) {
        int l = 0, r=s.length()-1;

        while (l<r) {
            char cl = s.charAt(l);
            char cr = s.charAt(r);

            if (!Character.isLetterOrDigit(cl)) {
                l++;
                continue;
            }
            if (!Character.isLetterOrDigit(cr)) {
                --r;
                continue;
            }
            if (Character.toLowerCase(cl) != Character.toLowerCase(cr))
                return false;
            l++;
            r--;
        }
        return true;
    }

}
