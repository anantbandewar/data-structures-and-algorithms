// Problem: https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/


class Solution {
    public int[] searchRange(int[] nums, int target) {
        int[] res = new int[2];

        res[0] = findFirstPosition(nums, target);
        res[1] = findLastPosition(nums, target);

        return res;
    }

    private int findFirstPosition(int[] nums, int target) {
        int n = nums.length;
        int l = 0;
        int r = n-1;
        int mid = 0;
        int index = -1;

        while (l <= r) {
            mid = (l + r) >> 1;

            if (nums[mid] > target)
                r = mid - 1;
            else if (nums[mid] < target)
                l = mid + 1;
            else {
                index = mid;
                r = mid - 1;
            }
        }
        return index;
    }

    private int findLastPosition(int[] nums, int target) {
        int n = nums.length;
        int l = 0;
        int r = n-1;
        int mid = 0;
        int index = -1;

        while (l <= r) {
            mid = (l + r) >> 1;

            if (nums[mid] > target)
                r = mid - 1;
            else if (nums[mid] < target)
                l = mid + 1;
            else {
                index = mid;
                l = mid + 1;
            }
        }
        return index;
    }
}