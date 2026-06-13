class Solution {
    public boolean detectCapitalUse(String word) {
        int cnt=0;
        int scnt=0;
        if((int)word.charAt(0)>=65 && (int)word.charAt(0)<=90){
            for(int i=1;i<word.length();i++){
                if((int)word.charAt(i)>=97 && (int)word.charAt(i)<=122){
                    cnt++;
                }else if((int)word.charAt(i)>=65 && (int)word.charAt(i)<=90){
                    scnt++;
                }
                
            }
            if((cnt+1)==word.length()){
                return true;
               
            }
            else if((scnt+1)==word.length()){
                return true;
            }
            cnt=0;

        }
        if((int)word.charAt(0)>=97 && (int)word.charAt(0)<=122){
            for(int i=1;i<word.length();i++){
                if((int)word.charAt(i)>=97 && (int)word.charAt(i)<=122){
                    cnt++;
                }
            }if((cnt+1)==word.length()){
                return true;
               
            }
        }
        return false;

        
    }
}