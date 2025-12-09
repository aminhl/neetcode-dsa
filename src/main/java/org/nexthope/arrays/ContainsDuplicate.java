package org.nexthope.arrays;

import java.util.Arrays;

public class ContainsDuplicate {

    public static boolean hasDuplicate(int[] nums) {
        return Arrays.stream(nums).distinct().count() != nums.length;
    }

}
