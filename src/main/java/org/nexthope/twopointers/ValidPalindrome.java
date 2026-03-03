package org.nexthope.twopointers;

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

}
