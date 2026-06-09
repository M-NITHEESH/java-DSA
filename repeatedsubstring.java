class Solution {
    public boolean repeatedSubstringPattern(String s) {
        int n=s.length();
        for(int i=1;i<=n/2;i++){
            if(n%i!=0){
                continue;
            }
            int times=n/i;
            String str=s.substring(0,i);
            String str1=new String();
            for(int j=0;j<times;j++){
                str1=str1+str;
            }
            if(str1.equals(s)){
                return true;
            }
        }
        return false;
        


        
    }
}