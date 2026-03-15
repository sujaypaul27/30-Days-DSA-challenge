class Solution {
    
    public boolean circularArrayLoop(int[] nums) {
        int n = nums.length;
        
        for(int i = 0; i < n; i++){
            
            int slow = i;
            int fast = i;
            
            boolean direction = nums[i] > 0;
            
            while(true){
                
                slow = next(nums, direction, slow);
                if(slow == -1) break;
                
                fast = next(nums, direction, fast);
                if(fast == -1) break;
                
                fast = next(nums, direction, fast);
                if(fast == -1) break;
                
                if(slow == fast) return true;
            }
        }
        
        return false;
    }
    
    private int next(int[] nums, boolean direction, int index){
        
        boolean currentDirection = nums[index] > 0;
        
        if(direction != currentDirection)
            return -1;
        
        int n = nums.length;
        int nextIndex = ((index + nums[index]) % n + n) % n;
        
        if(nextIndex == index)
            return -1;
        
        return nextIndex;
    }
}