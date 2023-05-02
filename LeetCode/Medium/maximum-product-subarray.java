// Problem: https://leetcode.com/problems/maximum-product-subarray/


class Solution {
    public int maxProduct(int[] nums) {
        int currProd = 1, maxProd = Integer.MIN_VALUE;

        for (int i=0; i<nums.length; i++) {
            currProd *= nums[i];
            maxProd = Math.max(currProd, maxProd);

            if (currProd == 0) {
                currProd = 1;
            }
        }

        currProd = 1;

        for (int i=nums.length-1; i>=0; i--) {
            currProd *= nums[i];
            maxProd = Math.max(currProd, maxProd);

            if (currProd == 0) {
                currProd = 1;
            }
        }

        return maxProd;
    }
}