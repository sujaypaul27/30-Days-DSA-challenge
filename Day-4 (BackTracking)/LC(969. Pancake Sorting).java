import java.util.*;

class Solution {
    public List<Integer> pancakeSort(int[] arr) {
        List<Integer> result = new ArrayList<>();
        
        for (int size = arr.length; size > 1; size--) {
            // Step 1: find index of max element
            int maxIndex = findMaxIndex(arr, size);
            
            // If already in correct position, skip
            if (maxIndex == size - 1) continue;
            
            // Step 2: bring max to front
            if (maxIndex != 0) {
                flip(arr, maxIndex + 1);
                result.add(maxIndex + 1);
            }
            
            // Step 3: move max to correct position
            flip(arr, size);
            result.add(size);
        }
        
        return result;
    }
    
    private int findMaxIndex(int[] arr, int size) {
        int maxIndex = 0;
        for (int i = 1; i < size; i++) {
            if (arr[i] > arr[maxIndex]) {
                maxIndex = i;
            }
        }
        return maxIndex;
    }
    
    private void flip(int[] arr, int k) {
        int left = 0, right = k - 1;
        while (left < right) {
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
    }
}