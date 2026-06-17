class Solution {
    public String reverseVowels(String s) {
        char[] ch=s.toCharArray();
        int k=s.length()-1;
        for(int i=0; i<s.length() && i<k; i++){
            char c1 = ch[i];

            if(ch[i]=='A' || ch[i]=='a' || ch[i]=='e' || ch[i]=='E' || ch[i]=='I' ||  ch[i]=='i' || ch[i]=='O' || ch[i]=='o' || ch[i]=='U' || ch[i]=='u'){
                
                for(int j=k;j>=0;j--){
                    char c2 = ch[j];
                    if(ch[j]=='A' || ch[j]=='a' || ch[j]=='e' || ch[j]=='E' || ch[j]=='I' ||  ch[j]=='i' || ch[j]=='O' || ch[j]=='o' || ch[j]=='U' || ch[j]=='u'  ){
                        ch[i]=c2;
                        ch[j]=c1;
                        k=j-1;
                        break;

                    }

                }
            }
            

        }
        String str="";
        for(int n=0;n<ch.length;n++){
            str=str+ch[n];
        }
        return str;

        
    }
}