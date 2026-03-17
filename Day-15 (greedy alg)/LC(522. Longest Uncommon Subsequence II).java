import java.util.*;

class Solution {
    public int findLUSlength(String[] strs) {
        // Sort by descending length
        Arrays.sort(strs, (a, b) -> b.length() - a.length());
        
        for (int i = 0; i < strs.length; i++) {
            boolean isUncommon = true;
            
            for (int j = 0; j < strs.length; j++) {
                if (i == j) continue;
                
                // If strs[i] is subsequence of strs[j]
                if (isSubsequence(strs[i], strs[j])) {
                    isUncommon = false;
                    break;
                }
            }
            
            if (isUncommon) {
                return strs[i].length();
            }
        }
        
        return -1;
    }
    
    private boolean isSubsequence(String a, String b) {
        int i = 0, j = 0;
        
        while (i < a.length() && j < b.length()) {
            if (a.charAt(i) == b.charAt(j)) {
                i++;
            }
            j++;
        }
        
        return i == a.length();
    }
}