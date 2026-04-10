class Solution {
    int maxLength(int arr[]) {
        // code here
        int n=arr.length;
        int prefixsum=0;
        int maxlength=0;
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int left=0;left<n;left++)
        {
            prefixsum+=arr[left];
           if(prefixsum==0)
           {
                maxlength=left+1;   
           }
           if(map.containsKey(prefixsum))
           {
               int len=left-map.get(prefixsum);
               maxlength=Math.max(len,maxlength);
           }else{
               map.put(prefixsum,left);
           }
        }
        return maxlength;
    }
}