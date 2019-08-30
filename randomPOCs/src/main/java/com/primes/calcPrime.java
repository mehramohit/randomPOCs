package com.primes;

import java.util.ArrayList;
import java.util.concurrent.Callable;

public class calcPrime implements Callable<ArrayList<Integer>> {

	int start, end;

	public calcPrime(int start, int end) {
		this.start = start;
		this.end = end;
	}

	public static boolean findFactors(int num) {

		if (num > 2 && num % 2 == 0) {
			return false;
		}

		int top = (int) Math.sqrt(num) + 1;
		for (int i = 3; i < top; i += 2) {
			if (num % i == 0)
				return false;
		}
		return true;
		
		/*
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
		return true;*/
	}

	@Override
	public ArrayList<Integer> call() throws Exception {

		ArrayList<Integer> result = new ArrayList<Integer>();
		if (start == 2)
			result.add(new Integer(2));

		for (int i = start; i < end; i++) {
			//if (i % 90 == 0)
				//System.out.println();
			if (findFactors(i)) {
				//System.out.print(i + ", ");
				result.add(new Integer(i));
			}

		}
		return result;
	}

}
