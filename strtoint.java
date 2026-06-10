class Solution {
    public int myAtoi(String s) {
        String s1="";
        s1=s.strip();
        String str="";
        boolean negative=false;
        boolean n=true;
        long num=0;
        int n1=0;
        if(s1.length()==0){
            return 0;
        }
        if(s1.charAt(0)=='-'){
            negative = true;
            n1=1;
        }else if(s1.charAt(0)=='+'){
            negative = false;
            n1=1;
        }
        for(int i=n1;i<s1.length();i++){
            char ch=s1.charAt(i);
            
            boolean isNum = Character.isDigit(ch);
            if(isNum==true){
                if((ch-'0')>=0 && (ch-'0')<=9){
                    n=false;
                    str=str+ch;


                }
            }else{
                break;
            }
        }
        if(str.length()==0){
            return 0;
}
 //       int num=str-'0';
        for(int i = 0; i < str.length(); i++){
            int digit = str.charAt(i) - '0';

            num = num * 10 + digit;

            if(!negative && num > Integer.MAX_VALUE){
                return Integer.MAX_VALUE;
            }

            if(negative && -num < Integer.MIN_VALUE){
                return Integer.MIN_VALUE;
            }
        }

        if(negative){
            num = -num;
        }

        

        return (int)num;
        
    }
}