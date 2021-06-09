import java.util.*;

public class pattern7 {
    public static void pat7(int n){
        int nst=1;
        for(int row=1;row<=n;row++){
            for(int cst=1;cst<=n;cst++){
                if(row==cst)System.out.print("*	");
                else   System.out.print("	");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

       pat7(scn.nextInt());

    }
}