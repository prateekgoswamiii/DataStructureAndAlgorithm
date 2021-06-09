import java.util.*;

public class Span_Of_Array{
    public static int span(int [] arr){
        int maxEle=-(int) 1e9;
        int minEle= (int) 1e9;
        for(int ele : arr){
            maxEle=Math.max(maxEle,ele);
            minEle=Math.min(minEle,ele);
        }
        return maxEle-minEle;
    }

public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);    
    int n= scn.nextInt();
    int[] arr = new int [n];
    for(int i=0;i<arr.length;i++)
            arr[i]=scn.nextInt();
    int d =span(arr);
    System.out.println(d);
 }

}