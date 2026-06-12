class Solution {
    public int lengthOfLastWord(String s) {
        String s1=s.strip();
        int cnt=0;
        for(int i=s1.length()-1;i>=0;i--){
            if(s1.charAt(i)==' '){
                break;
            }
            cnt=cnt+1;

            
        }
        return cnt;
        
    }
}