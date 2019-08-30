package com.primes;

import java.util.ArrayList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class PrimeNumbers {
	public static void main(String[] args) throws InterruptedException {

		ExecutorService executorService = Executors.newFixedThreadPool(20);

		Future<ArrayList<Integer>> result1 = executorService.submit(new calcPrime(1, 100000));
		Future<ArrayList<Integer>> result2 = executorService.submit(new calcPrime(100000, 200000));
		Future<ArrayList<Integer>> result3 = executorService.submit(new calcPrime(200000, 300000));
		Future<ArrayList<Integer>> result4 = executorService.submit(new calcPrime(300000, 400000));
		Future<ArrayList<Integer>> result5 = executorService.submit(new calcPrime(400000, 500000));
		Future<ArrayList<Integer>> result6 = executorService.submit(new calcPrime(500000, 600000));
		Future<ArrayList<Integer>> result7 = executorService.submit(new calcPrime(600000, 700000));
		Future<ArrayList<Integer>> result8 = executorService.submit(new calcPrime(700000, 800000));
		Future<ArrayList<Integer>> result9 = executorService.submit(new calcPrime(800000, 900000));

		ArrayList<Future<ArrayList<Integer>>> all = new ArrayList<Future<ArrayList<Integer>>>();
		all.add(result1);
		all.add(result2);
		all.add(result3);
		all.add(result4);
		all.add(result5);
		all.add(result6);
		all.add(result7);
		all.add(result8);
		all.add(result9);

		try {

			for (int i = 0; i < all.size(); i++) {
				ArrayList<Integer> resultList = all.get(i).get();
				System.out.println("result" + i + ":" + resultList.toString());
			}

		} catch (Exception e) {
			// interrupts if there is any possible error
			result1.cancel(true);
			result2.cancel(true);
			result3.cancel(true);
			result4.cancel(true);
		}

		executorService.shutdown();
	}
}
