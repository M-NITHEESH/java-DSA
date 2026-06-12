class Solution {
    public boolean isPalindrome(int x) {
        boolean otp=false;
        int b=x;
        int y=0;
        int z;
        if (x < 0) {
            return false;
        }
        while(x!=0){
            z=x%10;
            x=x/10;
            y=(y*10)+z;
        }
        if(y==b){
            return otp=true;
        }
        return otp;
        
    }
}