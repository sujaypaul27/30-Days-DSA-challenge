
class Solution {
    public int findRadius(int[] houses, int[] heaters) {
        Arrays.sort(heaters);// sort the heaters array to perform binary search
        int radius = 0;// initialize the radius to 0

        for (int house : houses) {// iterate through each house
            int index = Arrays.binarySearch(heaters, house);// perform binary search to find the index of the heater that is closest to the current house

            if (index < 0) {// if the house is not found in the heaters array, the binary search will return a negative index
                index = -index - 1;// convert the negative index to the index of the next heater that is greater than the current house
            }

            int dist1 = index < heaters.length ? Math.abs(heaters[index] - house) : Integer.MAX_VALUE; // calculate the distance from the current house to the next heater that is greater than or equal to the current house, if it exists
            int dist2 = index > 0 ? Math.abs(house - heaters[index - 1]) : Integer.MAX_VALUE;// calculate the distance from the current house to the previous heater that is less than the current house, if it exists
// find the closest heater to the current house by taking the minimum of the two distances
            int closest = Math.min(dist1, dist2);// update the radius to be the maximum of the current radius and the closest distance for the current house
            radius = Math.max(radius, closest);    // update the radius to be the maximum of the current radius and the closest distance for the current house
        }

        return radius;
    }
}
