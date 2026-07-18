import java.util.Scanner;
public class pattern3{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=1;
        for(int i=n;i>0;i--){
            for(int j=0;j<i;j++){
                System.out.print(" ");
            }
            for(int p=1;p<=m;p++){
                System.out.print("* ");

            }
            m++;
            System.out.println("\n");

        }
        
    }
}