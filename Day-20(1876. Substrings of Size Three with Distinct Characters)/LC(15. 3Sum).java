class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        int n=nums.length-1;
        Arrays.sort(nums);
        List<List<Integer>> result=new ArrayList<>();
        for(int i=0;i<n-1;i++)
        {
            if(i>0 && nums[i]==nums[i-1]) continue;// skip duplicates

            int l=i+1;
            int r=n;
            while(l<r){
            int sum =nums[i]+nums[l]+nums[r];// calculate sum of three numbers
            
            if(sum==0)
            {
                result.add(Arrays.asList(nums[i],nums[l],nums[r]));// add triplet to result
                while(l<r && nums[l]==nums[l+1]) l++;// skip duplicates
                while(l<r && nums[r]==nums[r-1]) r--;// skip duplicates
                l++;// move left pointer
                r--;// move right pointer
            }else if(sum>0)
            {
                r--;// move right pointer
            }else{
                l++;// move left pointer
            }
            }
        }
        return result;// return list of triplets
    }
}