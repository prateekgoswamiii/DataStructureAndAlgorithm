import java.util.*;
    
    public class Gcd_And_Lcm{
        public static void gcdLcm(int n , int m){
            int o1=n;
            int o2=m;
            while(n%m!=0){
                int rem = n%m;
                n=m;
                m=rem;
            }
            
            int gcd=m;
            int lcm = (o1*o2)/gcd;
            System.out.println(gcd);
            System.out.println(lcm);
        }
    
    public static void main(String[] args) {
     Scanner scn = new Scanner(System.in);
     gcdLcm(scn.nextInt(),scn.nextInt());
     
     }
    }
