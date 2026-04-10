class Solution {
    public boolean checkSubarraySum(int[] nums, int k) {
        int n=nums.length;
        HashMap<Integer,Integer> map=new HashMap<>();
        map.put(0,-1);//for starting value
        int prefixsum=0;
        for(int left=0;left<n;left++)
        {
            prefixsum+=nums[left];
           int rem=prefixsum%k;
           if(map.containsKey(rem))
           {
            if(left-map.get(rem)>=2)
            {
                return true;
            }
           }else{
            map.put(rem,left);
           }
        }
        return false;
    }
}