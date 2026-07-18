import java.util.ArrayList;
import java.util.Scanner;
public class anagram {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        String str1=sc.nextLine();
        if(str.length()!=str1.length()){
            System.out.println("False");
        }else{
            ArrayList<Character> ar1=new ArrayList<>();
            ArrayList<Character> ar2=new ArrayList<>();
            for(int i=0;i<str.length();i++){
                ar1.add(str.charAt(i));
            }
            for(int j=0;j<str1.length();j++){
                ar2.add(str1.charAt(j));
            }
            for(int z=0;z<ar1.size();z++){
                for(int y=0;y<ar2.size();y++){
                    if(ar1.get(z)==ar2.get(y)){
                        ar1.remove(z);
                        ar2.remove(y);
                        z=z-1;
                        break;
                        
                    }
                }
            }
            if(ar1.size()==0 && ar2.size()==0){
                System.out.println("True");
            }else{
                System.out.println("False");
            }
        }

    }
}
