class Solution {
    public int longestOnes(int[] nums, int k) {
        int n=nums.length;
        int left=0;
        int max=0;
        int zerocount=0;
        for(int right=0;right<n;right++){
            if(nums[right]==0)
            {
                zerocount++;
            }
            if(zerocount>k){
                if(nums[left]==0){
                    zerocount--;
                }
                left++;
            }
            max=right-left+1;//since right pointer is in last element and didnt end the loop
        }
        return max;
    }
}