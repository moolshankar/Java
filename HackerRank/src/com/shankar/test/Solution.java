package com.shankar.test;

import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
        String sIn1 = in.nextLine();
        String sIn = sIn1.toLowerCase();
        String sTest = "abcdefghijklmnopqrstuvwxyz";
        int len = sTest.length();
        boolean flag = true;
        for(int i=0;i<len;i++)
        {	
        	char ch = sTest.charAt(i);
        	int test = sIn.indexOf(ch);
        	if(test>=0)
        		continue;
        	else
        	{
        		flag = false;
        		break;
        	}
        }
        
        if (flag == true)
        	System.out.println("pangram");
        else
        	System.out.println("not pangram");

	}
	
}
