package com.primes;

public class ThreadController {
	public static void main(String[] args) {

		
		
		Runnable r1 = new calcPrimeThread(1, 1000, "Thread 1");
		Runnable r2 = new calcPrimeThread(1000, 2000, "Thread 2");
		Runnable r3 = new calcPrimeThread(2000, 3000, "Thread 3");
		Runnable r4 = new calcPrimeThread(3000, 4000, "Thread 4");
		Runnable r5 = new calcPrimeThread(4000, 5000, "Thread 5");
		Runnable r6 = new calcPrimeThread(5000, 6000, "Thread 6");
		Runnable r7 = new calcPrimeThread(6000, 7000, "Thread 7");
		Runnable r8 = new calcPrimeThread(7000, 8000, "Thread 8");
		Runnable r9 = new calcPrimeThread(8000, 9000, "Thread 9");
		Runnable r10 = new calcPrimeThread(9000, 10000, "Thread 10");
		
		
		
		
		//new Thread(r1).start();
		//new Thread(r2).start();
	//	new Thread(r3).start();
	//	new Thread(r4).start();
	//	new Thread(r5).start();
	//	new Thread(r6).start();
//		new Thread(r7).start();
//		new Thread(r8).start();
		new Thread(r9).start();
//		new Thread(r10).start();

	}
}
