package org.nexthope.arrays;


public class ProductsOfArrayExceptSelf {

    public static int[] productExceptSelfBf(int[] nums) {
        int[] output = new int[nums.length];
        int totalProduct = 1;
        int zeroCount = 0;
        for (int num : nums) {
            if (num == 0)
                zeroCount++;
            else
                totalProduct *= num;
        }
        for (int i = 0; i <nums.length; i++) {
            if (zeroCount > 1)
                output[i] = 0;
            else if (zeroCount == 1)
                output[i] = (nums[i] == 0) ? totalProduct : 0;
            else
                output[i] = totalProduct/nums[i];
        }
        return output;
    }




}
