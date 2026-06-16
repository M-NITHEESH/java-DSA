class Solution {
    public int missingNumber(int[] nums) {
        int min = 0;
        for (int i : nums) {
            if (min > i) {
                min = i;
            }
        }
        int max = 0;
        for (int n : nums) {
            if (max < n) {
                max = n;
            }
        }

        int j = 0;
        for (j = min; j <= max; j++) {
            boolean tr = false; // 1. Reset 'tr' to false for every new number 'j'
            
            for (int num : nums) {
                if (num == j) {
                    tr = true;
                    break; // 2. Found it! No need to look at the rest of the array for this 'j'
                }
                // 3. REMOVED 'j++' from here. Increments belong ONLY in the outer for-loop header.
            }
            
            if (tr == false) {
                return j; // 4. If 'j' was never found in the array, 'j' is the missing number!
            }
        }
        return j; // 5. If 0 to max are all present, the missing number is max + 1 (which is 'j' after the loop ends)
    }
}
