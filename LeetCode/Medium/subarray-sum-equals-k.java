// Problem: https://leetcode.com/problems/subarray-sum-equals-k/


class Solution {
    public int subarraySum(int[] nums, int k) {
        int count = 0;
        long sum = 0;

        for (int i=0; i<nums.length; i++) {
            if (nums[i] == k) {
                ++count;
            }
            sum = nums[i];
            for (int j=i+1; j<nums.length; j++) {
                sum += nums[j];
                if (sum == k) {
                    ++count;
                }
            }
        }
        return count;
    }
}