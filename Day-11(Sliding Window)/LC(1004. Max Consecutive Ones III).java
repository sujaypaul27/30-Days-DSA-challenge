class Solution {
    public int longestOnes(int[] nums, int k) {
        int n=nums.length;
        int left=0;
        int max=0;
        int zerocount=0;
        for(int right=0;right<n;right++){
            if(nums[right]==0)
            {
                zerocount++;//if right pointer is at zero then we are adding one zero to the window so increase the count of zeros in the window
            }
            if(zerocount>k){
                if(nums[left]==0){
                    zerocount--;//if left pointer is at zero then we are removing one zero from the window so decrease the count of zeros in the window
                }
                left++;//move left pointer to right until we have at most k zeros in the window
            }
            max=right-left+1;//since right pointer is in last element and didnt end the loop
        }
        return max;
    }
}