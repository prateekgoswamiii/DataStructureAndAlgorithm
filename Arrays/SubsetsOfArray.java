import java.io.*;
import java.util.*;

public class SubsetsOfArray{
    public static void printSubsets(int[] arr){
        int n=arr.length;
        int ts = (int)Math.pow(2,n);
        for(int d=0;d<ts;d++){
            int[]binary=decimalTobinary(d,n);
        for(int i=0;i<n;i++){
            if(binary[i]==0)
                    System.out.print("-	");
            else
                    System.out.print(arr[i]+"	");
        }
        System.out.println();
        }
    }
    public static int[] decimalTobinary(int dec, int len){
        int[] ans= new int[len];
        int idx=ans.length-1;
        while(dec!=0){
            int rem= dec%2;
            dec/=2;
            
            ans[idx]=rem;
            idx--;
        }
        return ans;
    }

public static void main(String[] args) throws Exception {
   Scanner scn = new Scanner(System.in);
   int n = scn.nextInt();
   int[] arr = new int[n];
   for(int i=0;i<n;i++)
        arr[i]=scn.nextInt();
    printSubsets(arr);
    
}

}