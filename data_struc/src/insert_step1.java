import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class insert_step1 {
    
    

    public static void insertIntoSorted(int[] ar) {
       int last = ar[ar.length - 1];
       int i= ar.length-2;
       while(i>=0 && ar[i] > last){
    	   ar[i+1] = ar[i];
    	   printArray(ar);
    	   i--;
       }
       if(i==-1){
    	   ar[0] = last;
    	   printArray(ar);
       }
       if(i>=0 && ar[i]<=last){
    	   ar[i+1]=last;
    	   printArray(ar);
       }
    }
    
    
/* Tail starts here */
     public static void main(String[] args) {
    	 Scanner in = new Scanner(System.in);
        int s = in.nextInt();
        int[] ar = new int[s];
         for(int i=0;i<s;i++){
            ar[i]=in.nextInt(); 
         }
         in.close();
         insertIntoSorted(ar);
    }
    
    
    private static void printArray(int[] ar) {
      for(int n: ar){
         System.out.print(n+" ");
      }
        System.out.println("");
   }
    
    
}
