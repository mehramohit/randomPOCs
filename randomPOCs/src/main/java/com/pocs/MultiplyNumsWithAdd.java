package com.pocs;

public class MultiplyNumsWithAdd {
	public static int multiAdd(int x, int y) {
		if(y == 0)
			return 0;
		else {
			return x + multiAdd(x, y-1);
			
		}
	}
	
	public static int[] multiAddArray(int x[], int y[]) {
		
	}
	
	public static void main(String[] args) {
		System.out.println(multiAdd(5, 8));
	}
}
