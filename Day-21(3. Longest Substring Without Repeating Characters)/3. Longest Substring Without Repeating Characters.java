class Solution {
    public int lengthOfLongestSubstring(String s) {
        int left =0;
        int max=0;
        int [] freq=new int [128];
        for(int right=0;right<s.length();right++){
            char ch=s.charAt(right);
            freq[ch]++;
            while(freq[ch]>1){
                freq[s.charAt(left)]--;
                left++;
            }
            max=Math.max(max,right-left+1);
        }
        return max;
    }
}// solution using sliding window and frequency array to keep track of characters in the current window. We expand the right pointer and if we encounter a duplicate character, we move the left pointer until there are no duplicates in the current window. We keep track of the maximum length of the substring without repeating characters.