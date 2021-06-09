import java.util.*;
public class Sum_Of_Two_Arrays{
    public static Scanner scn = new Scanner(System.in);
    public static void sumoftwoArray(int[] arr1,int[] arr2){
        int n = arr1.length;
        int m = arr2.length;
        int p = Math.max(n,m) +1;
        int[] ans = new int[p];
        
        int i=n-1, j=m-1, k=p-1 , carry=0;
        while(k>=0){
            int sum = carry + (i>=0? arr1[i]:0)+(j>=0? arr2[j]:0);
            ans[k]=sum%10;
            carry=sum/10;
            i--;
            j--;
            k--;
        }
        for(int idx=0;idx<p;idx++){
            if(idx==0 && ans[idx]==0)
                        continue;
                System.out.println(ans[idx]);
            }
        }

        
    
    
    public static void main(String[] args){
        int a = scn.nextInt();
        int[] arr1 = new int[a];
        for(int i =0;i<arr1.length;i++){
                arr1[i]=scn.nextInt();
        }
        int b= scn.nextInt();
        int[] arr2 = new int[b];
         for(int j=0;j<arr2.length;j++){
            arr2[j]=scn.nextInt();
         }
        sumoftwoArray(arr1,arr2);

    }
}