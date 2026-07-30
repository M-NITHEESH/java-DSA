import java.util.HashMap;
import java.util.Scanner;
public class freq2 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String st=sc.nextLine();
        int c=0;
        HashMap<Character,Integer> map=new HashMap<>();
        for(int i=0;i<st.length();i++){
            if(map.containsKey(st.charAt(i))){
                map.put(st.charAt(i),map.get(st.charAt(i))+1);
            }else{
                map.put(st.charAt(i),1);
                c++;
            }
        }
        System.out.println(map);
        String newst="";
        char maxch=' ';
        
        for(int j=0;j<c;j++){
            int max=0;
            for(char key:map.keySet()){
                if(map.get(key)>max){
                    maxch=key;
                    max=map.get(key);
                    System.out.println(maxch);
                    System.out.println(max);
                }

            }
            for(int z=0;z<max;z++){
                newst=newst+maxch;
            }
            map.put(maxch,0);
            
        }
        System.out.println(newst);
        
    }
    
    
}
