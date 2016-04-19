package com.shankar.test;

/*public class MatrixDiagonalDifference {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

} */

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class MatrixDiagonalDifference {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int a[][] = new int[n][n];
        int sum_d1 = 0, sum_d2 = 0;
        for(int a_i=0; a_i < n; a_i++){
            for(int a_j=0; a_j < n; a_j++){
                a[a_i][a_j] = in.nextInt();
                if (a_i == a_j)
                    sum_d1 = sum_d1 + a[a_i][a_j];
            }
        }
        for(int a_i=0; a_i < n; a_i++){
            sum_d2 = sum_d2 + a[a_i][n-a_i-1];
        }
        
        int diff = sum_d1-sum_d2;
        System.out.println(Math.abs(diff));
    }
}

