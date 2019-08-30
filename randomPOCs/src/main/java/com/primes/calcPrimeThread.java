package com.primes;

import java.math.BigInteger;
import java.util.ArrayList;

public class calcPrimeThread implements Runnable {

	int start;
	int end;
	String threadName;

	calcPrimeThread(int start, int end, String threadName) {
		this.start = start;
		this.end = end;
		this.threadName = threadName;

	}

	public void run() {
		// computePrimeList();
		computeLargestPrime();
	}

	public void computeLargestPrime() {
		ArrayList<Integer> result = computePrimeList();
		System.out.println(result.get(result.size()));
	}

	public ArrayList<Integer> computePrimeList() {
		ArrayList<Integer> result = new ArrayList<Integer>();
		if (start == 2)
			result.add(new Integer(2));

		for (int i = start; i < end; i++) {
			if (isPrime(i)) {
				result.add(new Integer(i));
			}

		}
		return result;
	}

	public boolean isPrime(int num) {
		if (num > 2 && num % 2 == 0) {
			return false;
		}

		int top = (int) Math.sqrt(num) + 1;
		for (int i = 3; i < top; i += 2) {
			if (num % i == 0)
				return false;
		}
		return true;
	}

	public boolean isPrime(BigInteger num) {
		BigInteger two = BigInteger.valueOf((int) 2);
		if (num.compareTo(two) > 2 && num.mod(two) == BigInteger.valueOf((int) 0))
			return false;
		
		BigInteger top = num.multiply(num).add(BigInteger.ONE);
		
		for (int i = 3; i < top; i += 2) {
			if (num % i == 0)
				return false;
		}
		return true;
	}

}
