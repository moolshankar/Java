package com.shankar.test;

import java.util.Scanner;

class AmazonCode {
	
	static int[] arr;
	
	public static int f(int x){
		int sum =0;
		for (int i=1;i<=x;i++){
			sum = sum+gcd(i,x);
		}
		return sum;
	}
	
	public static int gcd(int n1, int n2){
		int modulus = 1;
		while (modulus !=0){
			modulus = n1%n2;
			n1 = n2;
			n2 = modulus;
		}
		return n1;
	}
	
	public static int compute(int x, int y){
		x = x-1;
		y = y-1;
		int sum =0;
		for(int i=x; i<=y;i++){
			sum = sum + f(arr[i]);
		}
		return sum;
		
	}
	
	public static void update(int x, int y){
		x = x-1;
		arr[x] = y;
	}
	
    public static void main(String args[] ) throws Exception {
        @SuppressWarnings("resource")
		Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        arr = new int[N];
        for(int i=0; i<N;i++){
        	arr[i] = in.nextInt();
        }
        int Qn = in.nextInt();
        for(int i=0; i<Qn;i++){
        	String op = in.next();
        	int x = in.nextInt();
        	int y = in.nextInt();
        	if (op.equalsIgnoreCase("C")){
        		System.out.println(compute(x,y));
        	}
        	if(op.equalsIgnoreCase("U")){
        		update(x,y);
        	}
        }
   
    }
}

