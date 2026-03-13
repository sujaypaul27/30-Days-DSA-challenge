/*
 * // This is the custom function interface.
 * // You should not implement it, or speculate about its implementation
 * class CustomFunction {
 *     // Returns f(x, y) for any given positive integers x and y.
 *     // Note that f(x, y) is increasing with respect to both x and y.
 *     // i.e. f(x, y) < f(x + 1, y), f(x, y) < f(x, y + 1)
 *     public int f(int x, int y);
 * };
 */

class Solution {
    public List<List<Integer>> findSolution(CustomFunction customfunction, int z) // we will use two pointers to find the solution{
        
        List<List<Integer>> result = new ArrayList<>();// initialize the result list to store the pairs of (x, y) that satisfy the equation f(x, y) == z
        
        int x = 1;// initialize the first pointer x to 1, which is the smallest positive integer
        int y = 1000;// initialize the second pointer y to 1000, which is the largest positive integer
        
        while (x <= 1000 && y >= 1) {// we will continue to search for pairs of (x, y) until we exhaust all possibilities within the range of 1 to 1000
            
            int value = customfunction.f(x, y);// calculate the value of f(x, y) using the custom function
            
            if (value == z) {// if the value of f(x, y) is equal to z, we have found a valid pair (x, y) that satisfies the equation
                result.add(Arrays.asList(x, y));// add the pair (x, y) to the result list
                x++;// move the first pointer x to the next positive integer to continue searching for other pairs
                y--;// move the second pointer y to the previous positive integer to continue searching for other pairs
            }
            else if (value < z) {// if the value of f(x, y) is less than z, it means we need to increase the value of f(x, y) by increasing x, since f(x, y) is increasing with respect to x
                x++;// move the first pointer x to the next positive integer to increase the value of f(x, y)
            }
            else {// if the value of f(x, y) is greater than z, it means we need to decrease the value of f(x, y) by decreasing y, since f(x, y) is increasing with respect to y
                y--;// move the second pointer y to the previous positive integer to decrease the value of f(x, y)
            }
        }
        
        return result;// return the list of pairs (x, y) that satisfy the equation f(x, y) == z
    }
}