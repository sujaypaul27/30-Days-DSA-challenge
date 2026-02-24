class Solution {
    public int trap(int[] height) {
        int left =0;
        int right=height.length-1;
        int leftmax=0;
        int rightmax=0;
        int water=0;
        while(left<=right)
        {
            if(height[left]<height[right])// we can trap water on the left side
            {
                if(height[left]>=leftmax)
                {
                    leftmax=height[left];
                }else{
                    water+=leftmax-height[left];
                }
                left++;
            }else{// we can trap water on the right side
                if(height[right]>=rightmax)
                {
                    rightmax=height[right];
                }else{
                    water+=rightmax-height[right];
                }
                right--;
            }
        }
        return water;
    }
}