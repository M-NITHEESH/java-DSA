class Solution {
    public String addStrings(String num1, String num2) {
        int c=0;
        String s="";
        char c1;
        String ss="";
        int len=0;
        if(num1.length()>num2.length()){
            len = num1.length();
            int rem=num1.length()-num2.length();
            ss = "0".repeat(rem);
            num2=ss+num2;
        }else{
            len=num2.length();
            int rem=num2.length()-num1.length();
            ss = "0".repeat(rem);
            num1=ss+num1;
        }
        String str=new String();
        for(int i=len-1;i>=0;i--){
            int i1=(num1.charAt(i)-'0')+(num2.charAt(i)-'0')+c;
            c=i1/10;
            i1=i1%10;
            s=i1+s;
        }
        if(c>0){
            s=c+s;
        }
        return s;

        
    }
}