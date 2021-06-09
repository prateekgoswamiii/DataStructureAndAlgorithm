import java.util.*;
public class DifferenceOfTwoArrays{
    public static Scanner scn = new Scanner(System.in);
    public static void diff(int[] arr1,int[] arr2){
        int n = arr1.length;
        int m = arr2.length;
        int[] ans = new int[m];
        
        int i=n-1,j=m-1,k=m-1,borrow=0;
        
        while(k>=0){
            int diff= borrow + arr2[j] - (i>=0?arr1[i]:0);
            if(diff<0){
                diff+=10;
                borrow=-1;
            }
            else
                borrow=0;
                
            ans[k]=diff;
            i--;
            j--;
            k--;
        }
        boolean nonZeroFound=false;
        for(int ele : ans){
            if(ele!=0)
                nonZeroFound=true;
            
            if(nonZeroFound)
                System.out.println(ele+ " ");
        }
    }
    public static int[] input(int n){
        int[] arr = new int[n];
        for(int i=0;i<n;i++)
            arr[i]=scn.nextInt();
        return arr;
    }
    public static void main(String[] args){
        int[] arr1 = input(scn.nextInt());
        int[] arr2 = input(scn.nextInt());
        diff(arr1,arr2);

    }
}