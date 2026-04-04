class Solution {
    public int subarraysWithKDistinct(int[] nums, int k) {
        return calculate(nums,k)-calculate(nums,k-1);//count of subarrays with exactly k distinct integers= count of subarrays with at most k distinct integers- count of subarrays with at most k-1 distinct integers
    //(k= k-(k-1) =>k=k)
    }
    private int calculate(int[] nums,int k){
        int l=0;
        int count=0;
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int r=0;r<nums.length;r++)
        {
            map.put(nums[r],map.getOrDefault(nums[r],0)+1);
            while(map.size()>k){
                map.put(nums[l],map.get(nums[l])-1);
                if(map.get(nums[l])==0)
                {
                    map.remove(nums[l]);
                }
                l++;
            }
            count+=r-l+1;//count of subarrays with at most k distinct integers
        }
        return count;
    }
}