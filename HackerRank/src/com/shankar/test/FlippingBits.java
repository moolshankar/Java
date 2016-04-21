package com.shankar.test;

import java.util.Scanner;

public class FlippingBits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for(int i=0;i<T;i++){
			long num = sc.nextLong();
			String converted = Long.toBinaryString(num);
			String bNum = new String(new char[32-converted.length()]).replace('\0', '0') + converted;
			String flipped = bNum.replace('0', '2');
			String temp = flipped.replace('1', '0');
			flipped = temp.replace('2', '1');
			System.out.println(Long.parseLong(flipped, 2));
		}
		
	}

}
