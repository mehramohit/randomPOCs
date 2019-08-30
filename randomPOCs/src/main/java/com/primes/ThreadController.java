package com.primes;

public class ThreadController {
	public static void main(String[] args) {

		Runnable r1 = new calcPrimeThread(1, 10000, "Thread 1");
		Runnable r2 = new calcPrimeThread(10000, 20000, "Thread 2");
		Runnable r3 = new calcPrimeThread(20000, 30000, "Thread 3");
		Runnable r4 = new calcPrimeThread(30000, 40000, "Thread 4");
		Runnable r5 = new calcPrimeThread(40000, 50000, "Thread 5");
		Runnable r6 = new calcPrimeThread(50000, 60000, "Thread 6");
		Runnable r7 = new calcPrimeThread(60000, 70000, "Thread 7");
		Runnable r8 = new calcPrimeThread(70000, 80000, "Thread 8");
		Runnable r9 = new calcPrimeThread(80000, 90000, "Thread 9");
		Runnable r10 = new calcPrimeThread(90000, 100000, "Thread 10");

		new Thread(r1).start();
		new Thread(r2).start();
		new Thread(r3).start();
		new Thread(r4).start();
		new Thread(r5).start();
		new Thread(r6).start();
		new Thread(r7).start();
		new Thread(r8).start();
		new Thread(r9).start();
		new Thread(r10).start();

	}
}
