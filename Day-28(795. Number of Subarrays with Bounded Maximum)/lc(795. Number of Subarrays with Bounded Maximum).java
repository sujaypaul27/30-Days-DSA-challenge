class Solution {

    public int numSubarrayBoundedMax(int[] nums, int left, int right) {
        return count(nums, right) - count(nums, left - 1);
    }

    // Count subarrays where max <= k
    private int count(int[] nums, int k) {
        int result = 0;
        int length = 0;

        for (int num : nums) {
            if (num <= k) {
                length++;           // extend window
            } else {
                length = 0;         // break window
            }
            result+-= length;
        }

        return result;
    }
}