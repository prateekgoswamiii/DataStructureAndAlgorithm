import java.util.*;
  
  public class Is_A_Number_Prime{
      public static Scanner scn = new Scanner(System.in);
        
      public static boolean isPrime(int n){
          for(int i=2;i*i<=n;i++){
              if(n%i==0)
                    return false;
              
         } return true;
          
      }
          
      public static void count(){
          int n = scn.nextInt();
          boolean res = isPrime(n);
          if(res==true){
              System.out.println("prime");
          }
          else
            System.out.println("not prime");        
      }          
  public static void main(String[] args) {
      int t= scn.nextInt();
      for(int i =1;i<=t;i++)
                count();
   }
  } 
<<<<<<< HEAD
  
=======
  
>>>>>>> 6e99b6ab93356dc3970f67c9c53829672f899fbf
