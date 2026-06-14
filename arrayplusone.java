class Solution {
    public int[] plusOne(int[] digits) {
        int n = digits[digits.length - 1];
        n = n + 1;
        if (n % 10 >= 0) {
            int c = n / 10;
            n = n % 10;
            digits[digits.length - 1] = n;
            
            int[] digits1 = new int[digits.length + 1];
            
            for (int i = digits.length - 2; i >= 0; i--) {
                int num = digits[i] + c; 
                c = num / 10;
                digits1[i + 1] = num % 10; 
            }
            
            digits1[digits.length] = n;
            
            if (c > 0) {
                digits1[0] = c;
                return digits1;
            } else {
               
                for (int i = 0; i < digits.length; i++) {
                    digits[i] = digits1[i + 1];
                }
                return digits;
            }
        }
        return digits;
    }
}
