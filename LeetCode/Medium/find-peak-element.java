// Problem: https://leetcode.com/problems/find-peak-element/


class Solution {
    public int findPeakElement(int[] arr) {
        int n = arr.length;
        int l = 0;
        int r = n - 1;
        int mid = 0;

        while (l <= r) {
            // finding mid my binary right shifting
            mid = (l + r) >> 1;

            // first case if mid is the answer
            if ((mid == 0 || arr[mid-1] <= arr[mid]) && (mid == n-1 || arr[mid+1] <= arr[mid]))
                break;

            // move the right pointer
            if (mid > 0 && arr[mid-1] > arr[mid])
                r = mid - 1;
                // move the left pointer
            else
                l = mid + 1;
        }
        return mid;
    }
}