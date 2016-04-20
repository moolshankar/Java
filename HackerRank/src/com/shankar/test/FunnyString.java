package com.shankar.test;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class FunnyString {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for(int i=0;i<T;i++){
            String S = sc.next();
            boolean flag = true;
            for(int j=1; j<S.length();j++){
                if(Math.abs((int)S.charAt(j)-(int)S.charAt(j-1)) != Math.abs((int)S.charAt(S.length()-1-j)-(int)S.charAt(S.length()-j))){
                    flag = false;
                    break;
                }                    
            }
            if(flag == true){
                System.out.println("Funny");
            }
            else{
                System.out.println("Not Funny");
            }
        }
    }
}
