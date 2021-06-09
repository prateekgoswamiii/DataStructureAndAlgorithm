import java.util.*;

<<<<<<< HEAD
public class Main{
=======
public class Prime_Factorisation_Of_A_Number{
>>>>>>> 6e99b6ab93356dc3970f67c9c53829672f899fbf
    public static void prime(int n){
        int i=2;
        while(n!=1){
            if(n%i==0){
                System.out.print(i+" ");
                n/=i;}
            else
                i++;
        }
        
    }
            

public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    prime(scn.nextInt());
     }
<<<<<<< HEAD
}
=======
}
>>>>>>> 6e99b6ab93356dc3970f67c9c53829672f899fbf
