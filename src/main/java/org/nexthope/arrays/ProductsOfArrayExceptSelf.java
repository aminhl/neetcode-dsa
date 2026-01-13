package org.nexthope.arrays;

import java.util.ArrayList;
import java.util.List;

public class ProductsOfArrayExceptSelf {

    public static int[] productExceptSelfBf(int[] nums) {
        int n = nums.length;
        List<Integer> result = new ArrayList<>();
        for (int i = 0; i <n ; i++) {
            int product = 1;
            for (int j = 0; j <n ; j++) {
                if (i == j) continue;
                product *= nums[j];
            }
            result.add(product);
        }
        return result.stream()
                .mapToInt(Integer::intValue)
                .toArray();
    }

}
