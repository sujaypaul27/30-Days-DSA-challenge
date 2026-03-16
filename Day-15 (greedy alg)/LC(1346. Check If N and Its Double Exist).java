import java.util.HashSet;

class Solution {
    public boolean checkIfExist(int[] arr) {
        HashSet<Integer> set = new HashSet<>();// Create a HashSet to store the elements of the array
        
        for (int num : arr) {// Iterate through each number in the array
            
            if (set.contains(num * 2) || (num % 2 == 0 && set.contains(num / 2))) {
                return true;// Check if the HashSet contains either the double of the current number or half of the current number (if it's even)
            }
            
            set.add(num);// Add the current number to the HashSet for future checks
        }
        
        return false;// If no such pair is found after iterating through the entire array, return false
    }
}