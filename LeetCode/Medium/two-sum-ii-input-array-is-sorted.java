// Problem: https://leetcode.com/problems/two-sum-ii-input-array-is-sorted/


class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int[] res = new int[2];
        int l = 0;
        int r = numbers.length - 1;
        int sum = 0;

        while (l < r) {
            sum = numbers[l] + numbers[r];
            if (sum == target) {
                res[0] = l + 1;
                res[1] = r + 1;
                break;
            } else if (sum > target)
                r--;
            else
                l++;
        }

        return res;
    }
}