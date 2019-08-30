package com.primes;

import java.util.ArrayList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;


public class PrimeNumbers {
	public static void main(String[] args) throws InterruptedException {
		
		ExecutorService executorService = Executors.newFixedThreadPool(20);

	    Future<ArrayList<Integer>> result1 = executorService.submit(new calcPrime(1,10000));
	    Future<ArrayList<Integer>> result2 = executorService.submit(new calcPrime(10000,20000));
	    Future<ArrayList<Integer>> result3 = executorService.submit(new calcPrime(20000,30000));
	    Future<ArrayList<Integer>> result4 = executorService.submit(new calcPrime(30000,40000));

	    try {
	        ArrayList<Integer> resultList1 = result1.get();
	        System.out.println("result1: " + resultList1.toString());
	        
	        ArrayList<Integer> resultList2 = result2.get();
	        System.out.println("result2: " + resultList2.toString());
	        
	        ArrayList<Integer> resultList3 = result3.get();
	        System.out.println("result3: " + resultList3.toString());
	        
	        ArrayList<Integer> resultList4 = result4.get();
	        System.out.println("result4: " + resultList4.toString());        
	        
	        
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
