package com.shankar.test;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class InsetionSort {
    
    

	public static void insertIntoSorted(int[] ar) {
        // Fill up this function
        int temp = ar[ar.length-1];
        boolean flag = false;
        for (int i=(ar.length)-1;i>0;i--){
            ar[i] = ar[i-1];
            
            if (ar[i]<=temp){
                ar[i]=temp;
                flag = true;
                break;
            }
            System.out.println(Arrays.toString(ar).replaceAll("\\[|\\]|,|", ""));                
        }
        if(flag == false){
        	ar[0] = temp;
        }
        System.out.println(Arrays.toString(ar).replaceAll("\\[|\\]|,|", ""));
    }
    
    
/* Tail starts here */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int s = in.nextInt();
        int[] ar = new int[s];
        for(int i=0;i<s;i++){
            ar[i]=in.nextInt(); 
        }
        insertIntoSorted(ar);
    }
    
    
    private static void printArray(int[] ar) {
        for(int n: ar){
            System.out.print(n+" ");
        }
        System.out.println("");
    }
}
 

