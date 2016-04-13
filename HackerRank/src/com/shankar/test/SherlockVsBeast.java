package com.shankar.test;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class SherlockVsBeast {
	
	public static String createStr(int counter, int  num){
		String result = "";
		for (int i=0;i<counter;i++){
			result = result + String.valueOf(num);
		}
		return result;
		
	}

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int a0 = 0; a0 < t; a0++){
            int n = in.nextInt();
            if (n%3 == 0){
                System.out.println(createStr(n,5));
            }
            else{
            			if ((n-5)%3 == 0 && (n-5) > 0){
            				System.out.println(createStr(n-5,5)+createStr(5,3));
            			}
            			else{
            				if ((n-10)%3 == 0 && (n-10) > 0){
                				System.out.println(createStr(n-10,5)+createStr(10,3));
                			}
            				else{
            					if ((n-3)%5 == 0 && (n-3) > 0){
                    				System.out.println(createStr(3,5)+createStr((n-3),3));
                    			}
            					else{
            						if ((n-6)%5 == 0 && (n-6) > 0){
                        				System.out.println(createStr(6,5)+createStr((n-6),3));
                        			}
            						else{
            							if (n%5 == 0){
                    		                System.out.println(createStr(n,3));
                    		            }
                    					else{
                    						System.out.println("-1");
                    					}
            						}
            					}
            					 
            				}            				
            			}            			

            }
        }
    }
}
