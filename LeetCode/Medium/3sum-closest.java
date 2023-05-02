// Problem: https://leetcode.com/problems/3sum-closest/


class Solution {
    public int threeSumClosest(int[] nums, int target) {
        int result = Integer.MAX_VALUE, start, end, sum;
        Arrays.sort(nums);

        for (int i=0; i<nums.length-2; i++) {
            start = i+1;
            end = nums.length-1;

            while (start < end) {
                sum = nums[i] + nums[start] + nums[end];
                if (sum > target)
                    end--;
                else
                    start++;

                if (Math.abs(sum - target) < Math.abs(result-target))
                    result = sum;
            }
        }
        return result;
    }
}