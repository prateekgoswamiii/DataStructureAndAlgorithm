import java.util.*;
public class binarysearch{
    public static int search(int [] arr,int data){
        int low=0;
        int high =arr.length-1;
        while(low<=high){
            int mid = (low+high)/2;
            if(arr[mid]==data)
                return mid;
            else if(arr[mid]<data)
                    low=mid+1;
            else        
                    high=mid-1;
        }
        return -1;
    }
public static void main(String[] args){
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    int[] arr = new int[n];
    for(int i=0;i<n;i++)
        arr[i]=scn.nextInt();
    int key = scn.nextInt();
    System.out.println(search(arr,key));
}}