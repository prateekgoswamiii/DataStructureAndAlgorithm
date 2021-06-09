import java.util.*;

public class pattern8 {
    public static void pat8(int n){
        for(int row=1;row<=n;row++){
            for(int cst=1;cst<=n;cst++){
                if(row+cst==n+1)System.out.print("*	");
                else   System.out.print("	");
            }
    
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

       pat8(scn.nextInt());

    }
}