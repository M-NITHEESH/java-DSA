class Solution {
    public String toLowerCase(String s) {
        char ch;
        String str="";
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            int n=(int)c;
            if(c>=65 && c<=90){
                n=n+32;
                c=(char)n;
            }
           
            str=str+c;
        }
        return str;
        
    }
}