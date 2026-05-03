package org.nexthope.neetcode.arrays;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class LongestConsecutiveSequence {

    public static int longestConsecutiveBf(int[] nums) {
        int n = nums.length;
        if (n == 0) return 0;
        Arrays.sort(nums);
        int maxConsec = 1, temp = 1;
        int l = 0, r = l+1;
        while (l < n-1 && r<n){
            if (nums[r] == nums[r-1]+1)
                temp++;
            else if (nums[r] == nums[r-1]) {
                r++;
                continue;
            }
            else {
                l = r;
                temp = 0;
            };
            r++;
            if (temp > maxConsec) maxConsec = temp;
        }
        return maxConsec;
    }

    public static int longestConsecutive(int[] nums) {
        int n = nums.length;
        if (n == 0) return 0;
        Set<Integer> set = new HashSet<>();
        for (int nb : nums)
            set.add(nb);
        int ct = 0;
        for (int nb : nums) {
            int curr = nb, streak = 0;
            while (set.contains(curr)) {
                curr++;
                streak++;
            }
            ct = Math.max(streak, ct);
        }
        return ct;
    }

    public static int longestConsecutiveII(int[] nums) {
        int n = nums.length;
        if (n < 2)
            return n;

        Set<Integer> store = Arrays.stream(nums)
                .boxed()
                .collect(Collectors.toSet());

        int maxConsc = 1;
        for (int nb : store) {
            int maxConscL = 1;
            if (store.contains(nb - 1)) continue;
            int next = 1;
            while (store.contains(nb + next)) {
                ++next;
                ++maxConscL;
            }
            if (maxConscL > maxConsc)
                maxConsc = maxConscL;
        }
        return maxConsc;

    }

}
