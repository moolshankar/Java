package com.shankar.test;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class SherlockVsBeast2 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int a0 = 0; a0 < t; a0++){
            int n = in.nextInt();
            boolean flag = false;
            int n3 =0, n5=0,i5=0;
                     
            while(n>=3 && (n - (5*i5))>=0){
                if((n - (5*i5))%3 == 0){
                    n3 = (n - (5*i5))/3;
                    n5 = i5;
                    flag = true;
                    break;
                }
                else{
                    ++i5;
                }
            }
            
            if (flag == true){
            	String opStr = "";
            	opStr = opStr + new String(new char[n3*3]).replace('\0', '5');
            	opStr = opStr + new String(new char[n5*5]).replace('\0', '3');
                System.out.println(opStr);           	
            }
            else{
            	System.out.println("-1");
            }
            
        }
    }
}