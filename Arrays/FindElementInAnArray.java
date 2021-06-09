import java.io.*;
import java.util.*;

public class FindElementInAnArray{
    public static int find(int[] arr,int data){
        for(int i =0;i<arr.length;i++){
            if(arr[i]==data)
                return i;
        }return -1;
    }

public static void main(String[] args) throws Exception {
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    int[] arr = new int [n];
    for(int i =0 ; i<arr.length;i++)
            arr[i]=scn.nextInt();
    int d =find(arr,scn.nextInt());
    System.out.println(d);
 }

}