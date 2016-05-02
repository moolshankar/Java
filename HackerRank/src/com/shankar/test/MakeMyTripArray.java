package com.shankar.test;

import java.util.HashSet;
import java.util.Scanner;

public class MakeMyTripArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc =  new Scanner(System.in);
	        int N = sc.nextInt();
	        String str = sc.next();
	        int q = sc.nextInt();
	        for (int  i=0; i<q ;i++){
	        	String X = sc.next();
	        	String Y = sc.next();
	        	HashSet<String> subStr=new HashSet<String>();
	        	//int Xc = str.replaceAll(X, X+" ").split(" ").length;	        		
	        	//int Yc = str.replaceAll(Y, Y+" ").split(" ").length;
	        	for(int j=0;j<N;j++){
	        		char ch = str.charAt(j);
	        		if(X.equals(String.valueOf(ch))){
	        			String tempStr = str;
	        			while(str.contains(Y)){
	        				int tempi = str.indexOf(Y.charAt(0));
		        			String sub = str.substring(j, tempi);
		        			subStr.add(sub);
		        			String ttemp = tempStr.replaceFirst(Y, null);
		        			tempStr = ttemp;
	        			}
	        			
	        		}
	        		if(Y.equals(String.valueOf(ch))){
	        			String tempStr = str;
	        			while(str.contains(X)){
	        				int tempi = str.indexOf(X.charAt(0));
		        			String sub = str.substring(j, tempi);
		        			subStr.add(sub);
		        			String ttemp = tempStr.replaceFirst(X, null);
		        			tempStr = ttemp;
	        			}
	        		}
	        	}
	        	
	        	System.out.println(subStr.size());
	        }

	}

}
