import java.util.*;

public class pattern18{
    public static void pat(int n ){
        for(int i =1;i<=n;i++){
            for(int j=1;j<=n;j++){
                if(i==j ||  i==1 || i+j==n+1 )
                        System.out.print("*	");
                        
                else if(i > (n+1)/2 && i>j && i+j >n+1)
                     System.out.print("*	");
                
                else
                    System.out.print("	");
            }
            System.out.println();
        }}
        

public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);

     pat(scn.nextInt());

 }
}