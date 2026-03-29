class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int currentcount=0;
        int maxcount=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==1)
            {
                currentcount++;
                
            }else{
                maxcount=Math.max(maxcount,currentcount);
                currentcount=0;
            }
        }
        maxcount=Math.max(maxcount,currentcount);
        return maxcount;
    }
}