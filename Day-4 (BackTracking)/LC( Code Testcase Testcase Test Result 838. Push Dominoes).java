class Solution {
    public String pushDominoes(String dominoes) {
        StringBuilder s = new StringBuilder();
        s.append('L').append(dominoes).append('R');
        
        char[] arr = s.toString().toCharArray();
        int i = 0;
        
        for (int j = 1; j < arr.length; j++) {
            if (arr[j] == '.') continue;
            
            int middle = j - i - 1;
            
            if (arr[i] == arr[j]) {
                for (int k = 1; k <= middle; k++) {
                    s.setCharAt(i + k, arr[i]);
                }
            } 
            else if (arr[i] == 'R' && arr[j] == 'L') {
                for (int k = 1; k <= middle; k++) {
                    if (k <= middle / 2) {
                        s.setCharAt(i + k, 'R');
                    } else if (k == middle / 2 + 1 && middle % 2 == 1) {
                        s.setCharAt(i + k, '.');
                    } else {
                        s.setCharAt(i + k, 'L');
                    }
                }
            }
            // L...R → do nothing
            
            i = j;
        }
        
        return s.substring(1, s.length() - 1);
    }
}