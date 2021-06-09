import java.util.*;
   
   public class Rotate_A_Number{
       public static int rotatenumber(int n , int r){
           int digit = countdigit(n);
           r%=digit;
           if(r<0)
                r+=digit;
           
           int div=1;
           int mul=1;
           for(int i =1;i<=digit;i++){
               if(i<=r)
                    div*=10;
               else
                    mul*=10;
           }
                int a=n%div;
                int b=n/div;
                
                return (a*mul+b);
           
       }
        public static int countdigit(int n ){
            int len=0;
            while(n!=0){
                n/=10;
                len++;
            }return len;
        }
   public static void main(String[] args) {
       Scanner scn = new Scanner(System.in);
       int ans = rotatenumber(scn.nextInt(),scn.nextInt());
       System.out.println(ans);
    }
   }
