package com.shankar.test;

import java.io.*;
import java.util.*;

public class BotSavesPrincess2 {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int r = sc.nextInt();
        int c = sc.nextInt();
        int pi =0, pj=0, mi=0,mj=0,mlv=0, mlh =0;
        String vm = null, hm = null;
        for (int i=0; i<N; i++){
            String s = sc.next();
            if(s.indexOf('p')>=0){
                pi = i;
                pj = s.indexOf('p');
                break;
            } 
        }
        
        if (pi>r){
            vm = "DOWN";
            mlv = pi-r;
        }
        else{
            vm = "UP";
            mlv = r-pi;
        }
        if (pj > c){
            hm = "RIGHT";
            mlh = pj-c;
        }
        else{
            hm = "LEFT";
            mlh = c-pj;
        }
        
        if (mlv>mlh){
            if (mlh != 0)
                System.out.println(hm);
            else
                System.out.println(vm);
        }
        else{
            if (mlv != 0)
                System.out.println(vm);
            else
                System.out.println(hm);
        }
        
        
        
    }
    
}