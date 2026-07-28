import java.util.HashMap;
import java.util.Scanner;
public class hash1 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String st=sc.nextLine();
        
        HashMap<Character,Integer> map=new HashMap<>();
        for(int i=0;i<st.length();i++){
            if(map.containsKey(st.charAt(i))){
                map.put(st.charAt(i),map.get(st.charAt(i))+1);
            }else{
                map.put(st.charAt(i),1);
            }
        }
        System.out.println(map);
        System.out.println("Enetr the caharcter to find its frequency:");
        char st2=sc.next().charAt(0);
        
        if(map.containsKey(st2)){
            System.out.println(map.getOrDefault(st2, 0));
            System.out.println("hello");
        }
    }
    
}
