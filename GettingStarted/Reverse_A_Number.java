import java.util.*;
   
   public class Reverse_A_Number{
       public static void reverse(int n){
           while(n!=0){
               int rev = n%10;
               n/=10;
               System.out.println(rev);
           }
       }
   
   public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    reverse(scn.nextInt());
    }
   }
