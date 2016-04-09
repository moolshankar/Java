package com.shankar.test;

import java.util.Scanner;

public class SumOfIntArray {
	static Scanner in = new Scanner(System.in);
	public long sum(int x){
		long sum = 0;
    	if (x==0)
    		return 0;
    	else
    		{
    			sum = sum + in.nextLong() + sum(x-1);
    			return sum;
    		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
        int t = in.nextInt();
        System.out.println(new SumOfIntArray().sum(t));

	}
	
}
