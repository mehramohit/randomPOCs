package com.recursion;

public class RecursiveInsertSort {

	public static int[] insertSort(int arr[], int size){
		if(size <=1)
			return arr;
		else {
			int biggest;
			for(int i =0; i<arr.length-1; i++) {
				biggest = arr[i];
				if(biggest > arr[i+1]) {
					int temp = arr[i+1];
					arr[i+1] = biggest;
					arr[i] = temp;
				}
			}
			return insertSort(arr, size-1);
		}
	}
	
	public static int fun1(int x, int y)  
	{ 
	  if(x == 0) 
	    return y; 
	  else
	    return fun1(x - 1,  x + y); 
	}
	
	
	public static void main(String[] args) {
		int arr[] = {2 , 4, 6, 9,12,55,3,8,99};
		
		int sorted[] = insertSort(arr, arr.length);
		for(int i : sorted) {
			System.out.print(i + ", ");
		}
		
		System.out.println();
		System.out.println(fun1(5, 2));
	}
	
}
