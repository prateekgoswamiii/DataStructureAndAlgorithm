import java.util.*;

public class pattern10{
    public static void pat(int n){
        int nspO = n/2;
        int nspI = -1;
        for(int row=1;row<=n;row++){
            for(int cspO=1;cspO<=nspO;cspO++)
                System.out.print("	");
            System.out.print("*	");
            
            for(int cspI=1;cspI<=nspI;cspI++)
                    System.out.print("	");
                
            if(nspI!=-1)
                System.out.print("*	");
                
            if(row<=n/2){
                nspO--;
                nspI+=2;
                    
                }
            else{
                nspO++;
                nspI-=2;
                }
            System.out.println();
        }
    }

public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);

     pat(scn.nextInt());
 }
}