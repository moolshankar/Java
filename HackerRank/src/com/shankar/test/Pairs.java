package com.shankar.test;

import java.io.*;
import java.util.*;

public class Pairs {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        long K = sc.nextLong();
        //long[] arr = new long[N];
        ArrayList<Long> arr = new ArrayList<Long>();
        long D = 0;
        long count = 0;
        for(int i=0;i<N;i++){
               arr.add(sc.nextLong());
        }
        Collections.sort(arr);
        int l =0;
        if(N%2 == 0){
            l = N/2;
        }
        else{
            l = (N/2)+1;
        }
        for(int i=0;i<l;i++){
            for(int j =N-1;j>=l;j--){
                long x = arr.get(j);
                long y = arr.get(i);
     			if (x-y == K)
                     ++count;
     		}
     }
        System.out.println(count);    
    }
}