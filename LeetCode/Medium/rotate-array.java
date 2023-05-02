// Problem: https://leetcode.com/problems/rotate-array/


class Solution {
    public void rotate(int[] nums, int k) {
        k %= nums.length;

        if (k < nums.length) {
            this.reverseArray(nums, 0, nums.length-1);
            this.reverseArray(nums, 0, k-1);
            this.reverseArray(nums, k, nums.length-1);
        }
    }

    private void reverseArray (int[] nums, int start, int end) {
        int temp;

        for (; start<end; start++, end--) {
            temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
        }
    }
}
