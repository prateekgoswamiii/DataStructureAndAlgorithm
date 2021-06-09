import java.util.*;

public class pattern19{
    public static void swastik(int n ){
        for(int r=1;r<=n;r++){
            for(int c=1;c<=n;c++){
                if(r==(n+1)/2 || c==(n+1)/2)
                        System.out.print("*	");
                else if(r==1 && c<(n+1)/2)
                        System.out.print("*	");
                else if(r==n && c>(n+1)/2)
                        System.out.print("*	");
                else if(c==1 && r>(n+1)/2)
                        System.out.print("*	");
                else if(c==n && r<(n+1)/2)
                        System.out.print("*	");
                else
                        System.out.print("	");


            }
            System.out.println();
        }
    }

public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    swastik(scn.nextInt());
 }
}