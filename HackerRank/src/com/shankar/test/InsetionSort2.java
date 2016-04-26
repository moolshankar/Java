package com.shankar.test;

import java.io.*;
import java.util.*;

public class InsetionSort2 {

    public static void insertionSortPart2(int[] ar)
    {       
           // Fill up the code for the required logic here
           // Manipulate the array as required
           // The code for Input/Output is already provided
        for(int i=1;i<ar.length;i++){            
            for(int j=i;j>0;j--){
                int temp = ar[j];                
                if (ar[j]<ar[j-1]){
                    ar[j] = ar[j-1];
                    ar[j-1] = temp;
                }
                
            }
            System.out.println(Arrays.toString(ar).replaceAll("\\[|\\]|,|", ""));
        }
        
    }  
    
    
      
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
       int s = in.nextInt();
       int[] ar = new int[s];
       for(int i=0;i<s;i++){
            ar[i]=in.nextInt(); 
       }
       insertionSortPart2(ar);    
                    
    }    
    private static void printArray(int[] ar) {
      for(int n: ar){
         System.out.print(n+" ");
      }
        System.out.println("");
   }
}

