package com.shankar.test;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class LonelyInteger {
   static int lonelyinteger(int[] a) {
	   HashMap<Integer,Integer> hm=new HashMap<Integer,Integer>();
	   for(int i=0;i<a.length;i++){
		   if(hm.containsKey(a[i]) == true){
			   hm.remove(a[i]);
		   }
		   else{
			   hm.put(a[i], 1);
		   }
	   }
	   int temp = 0;
	   for(Map.Entry m:hm.entrySet())
		   temp = (int) m.getKey();
      return temp;
    }
   public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int res;
        
        int _a_size = Integer.parseInt(in.nextLine());
        int[] _a = new int[_a_size];
        int _a_item;
        String next = in.nextLine();
        String[] next_split = next.split(" ");
        
        for(int _a_i = 0; _a_i < _a_size; _a_i++) {
            _a_item = Integer.parseInt(next_split[_a_i]);
            _a[_a_i] = _a_item;
        }
        
        res = lonelyinteger(_a);
        System.out.println(res);
        
    }
}
