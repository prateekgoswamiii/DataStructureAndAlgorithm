import java.util.*;

public class pattern20 {
    public static void pat(int n ){
        for(int r=1;r<=n;r++){
            for(int c=1;c<=n;c++){
                if(c==1 || c==n)
                    System.out.print("*	");
                else if(r>=(n+1)/2 && (r==c || r+c==n+1))
                    System.out.print("*	");
                else
                     System.out.print("	");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        pat(scn.nextInt());

    }
}