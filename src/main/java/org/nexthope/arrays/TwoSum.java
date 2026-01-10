package org.nexthope.arrays;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {

    public static int[] twoSumBf(int[] nums, int target) {
       int n = nums.length;
        for (int i = 0; i <n-1 ; i++) {
            for (int j = i+1; j <n ; j++) {
                if (nums[i] + nums[j] == target)
                    return new int[] {i,j};
            }
        }
        return new int[0];
    }

    public static int[] twoSum(int[] nums, int target) {
        int n = nums.length;
        Map<Integer, Integer> result = new HashMap<>();
        for (int i = 0; i <n ; i++) {
            if (result.containsKey(target-nums[i]))
                return new int[] {result.get(target-nums[i]), i};
            result.put(nums[i], i);
        }
        return new int[0];
    }

}
