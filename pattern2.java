import java.util.Scanner;
public class pattern2{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int c=1;
        for(int j=n;j>0;j--){
            for(int i=j-1;i>0;i--)
            {
                System.out.print(" ");
            }
            for(int p=1;p<=c;p++){
                System.out.print("*");
            
                
            }
            System.out.print("\n");
            c=c+1;

        }
    }
}