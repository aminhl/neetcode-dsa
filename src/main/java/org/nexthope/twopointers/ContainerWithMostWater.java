package org.nexthope.twopointers;

public class ContainerWithMostWater {

    public static int maxAreaBf(int[] nums) {
        int n = nums.length, maxArea = 0;
        for (int i = 0; i <n ; i++) {
            for (int j = i+1; j <n ; j++) {
                int area = Math.min(nums[i],nums[j])*(j-i);
                if (area > maxArea) maxArea = area;
            }
        }
        return maxArea;
    }

    public static int maxArea(int[] nums) {
        int n=nums.length, maxArea=0, l=0, r=n-1;
        while (l<r) {
            int lh = nums[l], rh = nums[r];
            int area = (r-l)*Math.min(nums[l], nums[r]);
            if (lh < rh) l++;
            else if (lh > rh) r--;
            else l++;
            if (area > maxArea) maxArea = area;
        }
        return maxArea;
    }

}
