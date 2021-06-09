import java.util.*;
  
  public class Print_Fibonacci_Numbers_Till_N{
      public static void fib(int n){
          int a=0;
          int b=1;
          for(int i=1;i<=n;i++){
          System.out.println(a);
          int temp =a+b;                   
          a=b;
          b=temp;
          }
      }
  
  public static void main(String[] args) {
      Scanner scn = new Scanner(System.in);
      fib(scn.nextInt());
   }
  }
