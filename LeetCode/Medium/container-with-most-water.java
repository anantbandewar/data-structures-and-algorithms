// Problem: https://leetcode.com/problems/container-with-most-water/


class Solution {
    public int maxArea(int[] height) {
        int max = Integer.MIN_VALUE;
        int start=0, end=height.length-1, tempMax;

        while (start<end) {
            if (height[start] < height[end]) {
                tempMax = (end-start) * height[start];
                start++;
            }
            else {
                tempMax = (end-start) * height[end];
                end--;
            }

            if (tempMax > max)
                max = tempMax;
        }

        return max;
    }
}
