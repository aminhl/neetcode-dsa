package org.nexthope.twopointers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ThreeSum {

    public static List<List<Integer>> threeSumBf(int[] nums) {
        int n = nums.length;
        if (n < 3) return Collections.emptyList();
        List<List<Integer>> triplets = new ArrayList<>();
        for (int i = 0; i <n ; i++) {
            for (int j = i+1; j <n ; j++) {
                for (int k = j+1; k <n ; k++) {
                    if (nums[i] + nums[j] + nums[k] == 0)
                        triplets.add(Arrays.asList(nums[i],nums[j],nums[k]));
                }
            }
        }

        return triplets.stream()
                .map(triplet -> {
                    List<Integer> uqTriplet = new ArrayList<>(triplet);
                    Collections.sort(uqTriplet);
                    return uqTriplet;
                })
                .distinct()
                .toList();
    }

    public static List<List<Integer>> threeSum(int[] nums) {
        int n = nums.length;
        if (n < 3) return Collections.emptyList();
        Arrays.sort(nums);
        List<List<Integer>> triplets = new ArrayList<>();
        for (int i = 0; i <n ; i++) {
            if (nums[i] > 0) break;
            if (i > 0 && nums[i] == nums[i-1]) continue;;
            int l = i+1, r = n-1;
            while (l<r) {
                int sum = nums[i] + nums[l] + nums[r];
                if (sum > 0) r--;
                else if (sum < 0) l++;
                else {
                    triplets.add(Arrays.asList(nums[i],nums[l],nums[r]));
                    l++;
                    r--;
                    while (l<r && nums[l] == nums[l-1]) l++;
                }
            }
        }
        return triplets;
    }

}
