
class Solution {
    public int findRadius(int[] houses, int[] heaters) {
        Arrays.sort(heaters);
        int radius = 0;

        for (int house : houses) {
            int index = Arrays.binarySearch(heaters, house);

            if (index < 0) {
                index = -index - 1;
            }

            int dist1 = index < heaters.length ? Math.abs(heaters[index] - house) : Integer.MAX_VALUE;
            int dist2 = index > 0 ? Math.abs(house - heaters[index - 1]) : Integer.MAX_VALUE;

            int closest = Math.min(dist1, dist2);
            radius = Math.max(radius, closest);
        }

        return radius;
    }
}
