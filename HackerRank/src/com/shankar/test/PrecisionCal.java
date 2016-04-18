package com.shankar.test;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class PrecisionCal {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        float c_p = 0, c_n = 0, c_z = 0;
        int arr[] = new int[n];
        for(int arr_i=0; arr_i < n; arr_i++){
            arr[arr_i] = in.nextInt();
            if (arr[arr_i]>0){
                c_p = c_p + 1;
            }
            else
            if (arr[arr_i]<0){
                c_n = c_n + 1;
            }
            else{
                c_z = c_z + 1;
            }
        }
        System.out.println(c_p/n);
        System.out.println(c_n/n);
        System.out.println(c_z/n);
    }
}