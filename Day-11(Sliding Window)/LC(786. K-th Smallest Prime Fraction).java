import java.util.*;

class Solution {
    public int[] kthSmallestPrimeFraction(int[] arr, int k) {
        int n = arr.length;

        PriorityQueue<int[]> pq = new PriorityQueue<>(
            (a, b) -> arr[a[0]] * arr[b[1]] - arr[b[0]] * arr[a[1]]
        );

        // Push initial fractions (0 / j)
        for (int j = 1; j < n; j++) {
            pq.offer(new int[]{0, j});
        }

        // Extract k-1 smallest
        for (int count = 1; count < k; count++) {
            int[] top = pq.poll();
            int i = top[0];
            int j = top[1];

            if (i + 1 < j) {
                pq.offer(new int[]{i + 1, j});
            }
        }

        int[] res = pq.poll();
        return new int[]{arr[res[0]], arr[res[1]]};
    }
}