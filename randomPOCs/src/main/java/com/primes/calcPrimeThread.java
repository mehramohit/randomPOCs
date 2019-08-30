package com.primes;

import java.util.ArrayList;

public class calcPrimeThread implements Runnable{
	
	int start;
	int end;
	String threadName;
	long lStartTime;
	
	calcPrimeThread(int start, int end, String threadName){
		this.start = start;
		this.end = end;
		this.threadName = threadName;
		
		lStartTime = System.nanoTime();

		
	}
	
	public void run() {
		ArrayList<Integer> result = new ArrayList<Integer>();
		if (start == 2)
			result.add(new Integer(2));

		for (int i = start; i < end; i++) {
			if (findFactors(i)) {
				result.add(new Integer(i));
			}

		}
		System.out.println(threadName + " : " + result.toString());
		long lEndTime = System.nanoTime();
		long output = lEndTime - lStartTime;
      System.out.println("Elapsed time in milliseconds: " + output / 1000000);
	}
	
	
	public boolean findFactors(int n) {

		if (n % 2 == 0)
			return false;
		if (n % 3 == 0)
			return false;

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if ((i * j) == n && i != 1 && j != 1)
					return false;
			}
		}
		return true;
	}
}
