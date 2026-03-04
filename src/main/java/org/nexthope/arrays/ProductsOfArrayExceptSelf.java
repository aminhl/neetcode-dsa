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

    public static int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] result = new int[n];
        int[] prefix = new int[n];
        prefix[0] = nums[0];
        int[] postfix = new int[n];
        postfix[n-1] = nums[n-1];
        for (int i = 1; i <n ; i++)
            prefix[i] = nums[i]*prefix[i-1];
        for (int i = n-2; i >=0 ; i--)
            postfix[i] = nums[i] * postfix[i+1];

        result[0] = postfix[1];
        result[n-1] = prefix[n-2];

        for (int i = 1; i <n-1 ; i++)
            result[i] = prefix[i-1]*postfix[i+1];

        return result;
    }

}
