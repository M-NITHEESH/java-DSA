//s = "codeleet", indices = [4,5,6,7,0,2,1,3]
class shufflestring {
    public String restoreString(String s, int[] indices) {
        char[] ch=new char[s.length()];
        for(int i=0;i<s.length();i++){
            ch[indices[i]]=s.charAt(i);
        }
        String s1 = new String(ch);
        return s1;

    }
}
