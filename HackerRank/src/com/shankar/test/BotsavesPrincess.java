package com.shankar.test;

import java.util.Scanner;

public class BotsavesPrincess {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
        int m = in.nextInt();
        int pi = 0,pj =0,mi=0,mj=0,ml=0;
        String vm = null,hm = null;
        for(int i=0;i<m;i++){
            String row = in.next();
            if(row.indexOf('m')>=0){
            	mi = i;
            	mj = row.indexOf('m');
            }
            if(row.indexOf('p')>=0){
            	pi = i;
            	pj = row.indexOf('p');
            }
        }
        if (pi>mi){
        	vm = "DOWN";
        	ml = pi-mi;
        }
        
        else{
        	vm = "UP";
        	ml = mi-pi;
        }
        
        for (int j=0;j<ml;j++){
    		System.out.println(vm);
    	}
        
        if (pj>mj){
        	hm = "RIGHT";
        	ml = pj-mj;
        }
        
        else{
        	hm = "LEFT";
        	ml = mj-pj;
        }
        
        for (int j=0;j<ml;j++){
    		System.out.println(hm);
    	}
         
	}

}
