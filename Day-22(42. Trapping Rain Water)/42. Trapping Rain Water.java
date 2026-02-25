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

class Solution {
    public int totalFruit(int[] fruits) {
        if(fruits.length==0  ){//to avoid edge case
            return 0;
        }
        {

        }

        int left=0;
        int max=0;
        HashMap<Integer,Integer> count=new HashMap<>();

        for(int right=0;right<fruits.length;right++)
        {
            count.put(fruits[right],count.getOrDefault(fruits[right],0)+1);
        
        while(count.size()>2)
        {
            count.put(fruits[left],count.get(fruits[left])-1);
            if(count.get(fruits[left])==0)
            {
                count.remove(fruits[left]);
            }
            left++;
           
        }
         max=Math.max(max,right-left+1);
        }
        return max;
    }
}