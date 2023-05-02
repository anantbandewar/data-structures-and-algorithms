// Problem: https://leetcode.com/problems/maximum-subarray/


class Solution {
    public int maxSubArray(int[] nums) {
        int currSum = 0, maxSum = Integer.MIN_VALUE;

        for (int i=0; i<nums.length; i++) {
            currSum += nums[i];
            maxSum = Math.max(currSum, maxSum);

            if (currSum < 0) currSum = 0;
        }
        return maxSum;
    }
}