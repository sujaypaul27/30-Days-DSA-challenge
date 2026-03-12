class Solution {
    public void duplicateZeros(int[] arr) {
        int n = arr.length;
        int zeros = 0;

        // Count zeros
        for (int i = 0; i < n; i++) {
            if (arr[i] == 0) zeros++;// count the number of zeros in the array
        }

        int i = n - 1;
        int j = n + zeros - 1;

        // Traverse from the end
        while (i < j) {
            if (j < n) {// if the new position is within bounds, copy the current element to the new position
                arr[j] = arr[i];// copy the current element to the new position if it's within bounds
            }

            if (arr[i] == 0) {// if the current element is zero, we need to duplicate it
                j--;// if the current element is zero, we need to duplicate it, so we move the new position one step back and set it to zero
                if (j < n) {
                    arr[j] = 0;// set the new position to zero if it's within bounds
                }
            }

            i--;// move to the previous element in the original array
            j--;// move to the previous position in the new array
        }
    }
}