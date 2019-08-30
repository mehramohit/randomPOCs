package com.primes;

public class ThreadController {
	public static void main(String[] args) {

		/*Runnable r1 = new calcPrimeThread(1, 100000, "Thread 1");
		Runnable r2 = new calcPrimeThread(100000, 200000, "Thread 2");
		Runnable r3 = new calcPrimeThread(200000, 300000, "Thread 3");
		Runnable r4 = new calcPrimeThread(300000, 400000, "Thread 4");
		Runnable r5 = new calcPrimeThread(400000, 500000, "Thread 5");
		Runnable r6 = new calcPrimeThread(500000, 600000, "Thread 6");
		Runnable r7 = new calcPrimeThread(600000, 700000, "Thread 7");
		Runnable r8 = new calcPrimeThread(700000, 800000, "Thread 8");
		Runnable r9 = new calcPrimeThread(800000, 900000, "Thread 9");
		*/
		Runnable r10 = new calcPrimeThread(Integer.MAX_VALUE-200, Integer.MAX_VALUE, "Thread 10");

		/*new Thread(r1).start();
		new Thread(r2).start();
		new Thread(r3).start();
		new Thread(r4).start();
		new Thread(r5).start();
		new Thread(r6).start();
		new Thread(r7).start();
		new Thread(r8).start();
		new Thread(r9).start();
		*/
		new Thread(r10).start();

	}
}
