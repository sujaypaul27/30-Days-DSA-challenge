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
                    leftmax=height[left];// update the leftmax if the current height is greater than or equal to the leftmax
                }else{
                    water+=leftmax-height[left];// we can trap water on the left side if the current height is less than the leftmax
                }
                left++;
            }else{// we can trap water on the right side
                if(height[right]>=rightmax)
                {
                    rightmax=height[right];// update the rightmax if the current height is greater than or equal to the rightmax
                }else{
                    water+=rightmax-height[right];// we can trap water on the right side if the current height is less than the rightmax
                }
                right--;
            }
        }
        return water;
    }
}
