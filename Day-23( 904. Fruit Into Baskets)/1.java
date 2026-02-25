
class Solution {
    public int totalFruit(int[] fruits) {
        if(fruits.length==0  ){//to avoid edge case
            return 0;
        }
        {

        }

        int left=0;// left pointer of the window
        int max=0;// to store the maximum length of the window
        HashMap<Integer,Integer> count=new HashMap<>();// to store the count of each fruit in the current window

        for(int right=0;right<fruits.length;right++)// iterate through the fruits array with the right pointer
        {
            count.put(fruits[right],count.getOrDefault(fruits[right],0)+1);// increase the count of the fruit at the right pointer
        
        while(count.size()>2)
        {
            count.put(fruits[left],count.get(fruits[left])-1);// decrease the count of the fruit at the left pointer
            if(count.get(fruits[left])==0)// if the count of the fruit at the left pointer is 0, remove it from the map
            {
                count.remove(fruits[left]);// remove the fruit from the map
            }
            left++;
           
        }
         max=Math.max(max,right-left+1);// update the max length of the window
        }
        return max;
    }
}