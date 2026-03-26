import java.util.*;

class Solution {
    public List<Integer> findSubstring(String s, String[] words) {
        List<Integer> result = new ArrayList<>();
        
        if (s.length() == 0 || words.length == 0) return result;
        
        int wordLen = words[0].length();
        int wordCount = words.length;
        int totalLen = wordLen * wordCount;
        
        // Store frequency of words
        Map<String, Integer> wordMap = new HashMap<>();
        for (String word : words) {
            wordMap.put(word, wordMap.getOrDefault(word, 0) + 1);
        }
        
        // Try every starting point
        for (int i = 0; i <= s.length() - totalLen; i++) {
            Map<String, Integer> seen = new HashMap<>();
            int j = 0;
            
            while (j < wordCount) {
                int start = i + j * wordLen;
                String sub = s.substring(start, start + wordLen);
                
                if (!wordMap.containsKey(sub)) break;
                
                seen.put(sub, seen.getOrDefault(sub, 0) + 1);
                
                if (seen.get(sub) > wordMap.get(sub)) break;
                
                j++;
            }
            
            if (j == wordCount) {
                result.add(i);
            }
        }
        
        return result;
    }
}