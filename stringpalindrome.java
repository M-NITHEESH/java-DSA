/*A phrase is a palindrome if, after converting all uppercase letters into 
lowercase letters and removing all non-alphanumeric characters, 
it reads the same forward and backward. Alphanumeric characters
 include letters and numbers. */

class Solution {
    public boolean isPalindrome(String s) {

        String str2 = "";

        for (int i = 0; i < s.length(); i++) {
            if (Character.isLetterOrDigit(s.charAt(i))) {
                str2 += s.charAt(i);
            }
        }

        String str2lw = str2.toLowerCase();

        String str3 = "";

        for (int j = str2lw.length() - 1; j >= 0; j--) {
            str3 += str2lw.charAt(j);
        }

        return str2lw.equals(str3);
    }
}