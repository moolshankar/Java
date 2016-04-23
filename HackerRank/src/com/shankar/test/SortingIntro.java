package com.shankar.test;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class SortingIntro {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int V = sc.nextInt();
        int N = sc.nextInt();
        int index = 0;
        int[] arr = new int[N];
        for(int i=0;i<N;i++){
        	arr[i] = sc.nextInt();
        	if (arr[i] == V){
        		index = i;
        		break;
        	}
        		
        }  
        System.out.println(index);
    }
}
