class Solution {
    public String longestCommonPrefix(String[] strs) {
        // Edge case safety check
        if (strs == null || strs.length == 0) return "";
        
        int tlen = strs.length;
        String s = strs[0];
        int cnt = 1;
        boolean s2 = false;
        
        for (int j = 1; j < strs.length; j++) {
            // FIX 1: Use .startsWith() instead of .equals() for prefixes
            if (strs[j].startsWith(s)) {
                cnt = cnt + 1;
            } else {
                cnt = 1;
                
                // Safety check: if s is already empty, stop to avoid errors
                if (s.isEmpty()) return ""; 
                
                // FIX 2: Use s.length() - 1 to chop exactly one letter off the text
                s = s.substring(0, s.length() - 1);
                
                // FIX 3: Reset the loop to check the shortened 's' against all words again
                j = 0; 
            }
            
            if (cnt == tlen) {
                s2 = true;
                break; // Found it! Exit early
            }
        }
        
        // This handles cases where cnt == tlen on the very first single-word array
        if (cnt == tlen) {
            s2 = true;
        }

        if (s2 == true) {
            return s;
        } else {
            return "";
        }
    }
}
