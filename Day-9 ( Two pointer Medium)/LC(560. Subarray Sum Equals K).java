class Solution {
    public int subarraySum(int[] nums, int k) {
        int count=0;
        int prefixsum=0;
        HashMap<Integer,Integer> map=new HashMap<>();//to store values
        map.put(0,1);//to avoid single k valid element edge case
        for(int r=0;r<nums.length;r++)
        {
            prefixsum+=nums[r];
            if(map.containsKey(prefixsum-k))
            {
                count+=map.get(prefixsum-k);
            }
            map.put(prefixsum,map.getOrDefault(prefixsum,0)+1);
        }
        return count;
    }
}