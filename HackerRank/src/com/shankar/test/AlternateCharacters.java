package com.shankar.test;

import java.io.*;
import java.util.*;

public class AlternateCharacters {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i=0;i<n;i++){
            String s = sc.next();
            int count = 0;
            for(int j=0;j<s.length()-1;j++){
                if (s.charAt(j) == s.charAt(j+1)){
                    count++;
                }
            }
            System.out.println(count);
        }
    }
}
