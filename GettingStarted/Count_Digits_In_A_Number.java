import java.util.*;
  
  public class Count_Digits_In_A_Number{
      public static int countdigit(int n ){
          int len=0;
          while(n!=0){
              n/=10;
              len++;
          }return len;
      }
  
  public static void main(String[] args) {
      Scanner scn= new Scanner(System.in);
      System.out.println(countdigit(scn.nextInt()));
   }
  }
