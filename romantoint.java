class Solution {
    public int romanToInt(String s) {
        int val=0;
        int iv,vv,xv,lv,cv,dv,mv;
        iv=1;
        vv=2;
        xv=3;
        lv=4;
        cv=5;
        dv=6;
        mv=7;
        int pri=0;
        for(int i=s.length()-1;i>=0;i--){

            if(s.charAt(i)=='I'){
                if(pri<=iv){
                    val=val+1;


                }
                else if(pri>iv){
                    val=val-1;
                }
                pri=1;
                

            }
            else if(s.charAt(i)=='V'){
                if(pri<=vv){
                    val=val+5;


                }
                else if(pri>vv){
                    val=val-5;
                }
                pri=2;
            }
            else if(s.charAt(i)=='X'){
                if(pri<=xv){
                    val=val+10;

                }
                else if(pri>xv){
                    val=val-10;
                }
                pri=3;
            }
            else if(s.charAt(i)=='L'){
                if(pri<=lv){
                    val=val+50;

                }
                else if(pri>lv){
                    val=val-50;
                }
                pri=4;
            }
            else if(s.charAt(i)=='C'){
                if(pri<=cv){
                    val=val+100;

                }
                else if(pri>cv){
                    val=val-100;
                }
                pri=5;
            }
            else if(s.charAt(i)=='D'){
                if(pri<=dv){
                    val=val+500;

                }
                else if(pri>vv){
                    val=val-500;
                }
                pri=6;
            }
            else if(s.charAt(i)=='M'){
                if(pri<=mv){
                    val=val+1000;

                }
                else if(pri>mv){
                    val=val-1000;
                }
                pri=7;
            
            }

        
        }
        return val;


        
    }
    
}