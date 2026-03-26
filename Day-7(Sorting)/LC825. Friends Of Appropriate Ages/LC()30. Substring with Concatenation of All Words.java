import java.util.*;

class Solution {
    public List<Integer> findSubstring(String s, String[] words) {
        List<Integer> result = new ArrayList<>();
        
        if (s.length() == 0 || words.length == 0) return result;
        
        int wordLen = words[0].length();
        int wordCount = words.length;
        int totalLen = wordLen * wordCount;
        
        Map<String, Integer> wordMap = new HashMap<>();
        for (String word : words) {
            wordMap.put(word, wordMap.getOrDefault(word, 0) + 1);
        }
        
        // Try different offsets
        for (int i = 0; i < wordLen; i++) {
            int left = i, count = 0;
            Map<String, Integer> window = new HashMap<>();
            
            for (int right = i; right + wordLen <= s.length(); right += wordLen) {
                String word = s.substring(right, right + wordLen);
                
                if (wordMap.containsKey(word)) {
                    window.put(word, window.getOrDefault(word, 0) + 1);
                    count++;
                    
                    // Shrink window if extra word
                    while (window.get(word) > wordMap.get(word)) {
                        String leftWord = s.substring(left, left + wordLen);
                        window.put(leftWord, window.get(leftWord) - 1);
                        left += wordLen;
                        count--;
                    }
                    
                    // Valid window found
                    if (count == wordCount) {
                        result.add(left);
                    }
                    
                } else {
                    window.clear();
                    count = 0;
                    left = right + wordLen;
                }
            }
        }
        
        return result;
    }
}