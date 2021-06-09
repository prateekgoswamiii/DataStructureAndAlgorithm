import java.util.Scanner;
 
 public class RotateArray {
 
 	 public static int [] rotate(int[] a, int r) {
 	 	 int n = a.length;
 	 	 r%=n;
 	 	 if(r<0)
 	 	    r+=n;
 	 	 int [] ans = new int [n];
 	 	 for(int i=0;i<n;i++){
 	 	     int idx = (i+r)%n;
 	 	     ans[idx]=a[i];
 	 	 }
            return ans;
 	 }
 
 	 // Don't make any changes here
 	 public static void main(String[] args) {
 	 	 Scanner s = new Scanner(System.in);
 	 	 int n = s.nextInt();
 	 	 int k=s.nextInt();
 	 	 int[] ar = new int[n];
 	 	 for (int i = 0; i < n; i++) {
 	 	 	 ar[i] = s.nextInt();
 	 	 }
 	 	 int [] arr = rotate(ar, k);
 	 	 for (int v : arr)
 	 	 	 System.out.print(v + " ");
 	 }
 
 }