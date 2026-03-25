import java.util.*;

class Solution {
    public int numFriendRequests(int[] ages) {
        Arrays.sort(ages);
        int n = ages.length;
        int left = 0, right = 0;
        int count = 0;

        for (int i = 0; i < n; i++) {
            // Ignore age < 15 (no valid requests possible)
            if (ages[i] < 15) continue;

            // Move left pointer
            while (ages[left] <= 0.5 * ages[i] + 7) {
                left++;
            }

            // Move right pointer
            while (right < n && ages[right] <= ages[i]) {
                right++;
            }

            // Count valid people
            count += right - left - 1; // exclude self
        }

        return count;// Each request is counted twice (A->B and B->A), so divide by 2
    }
}