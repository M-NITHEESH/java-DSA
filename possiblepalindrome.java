import java.util.Scanner;
import java.util.ArrayList;
public class possiblepalindrome{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        ArrayList<Character> ar=new ArrayList<>();
        for(int i=0;i<str.length();i++){
            ar.add(str.charAt(i));

        }
        for(int j=0;j<ar.size();j++){
            for(int z=j+1;z<ar.size();z++){
                if(ar.get(j)==ar.get(z)){
                    ar.remove(z);
                    ar.remove(j);
                    j--;
                    break;
                }
            }
        }
        if(ar.size()==0 || ar.size()==1){
            System.out.println("True");
        }else{
            System.out.println("False");
        }
    }
}