238. Product of Array Except Self

class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n=nums.length;
        int[] res=new int[n];
        res[0]=1;//leftmost will be 1 first
        for(int l=1;l<n;l++)
        {
            res[l]=res[l-1]*nums[l-1];
        }
        int rp=1;
        for(int r=n-1;r>=0;r--)
        {
            res[r]=res[r]*rp;
            rp*=nums[r];
        }
        return res;
    }
}