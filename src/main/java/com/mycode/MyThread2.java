package com.mycode;

public class MyThread2 extends Thread{
	public void run() {
		System.out.println("Throwing in "+"MyThread2");
		throw new RuntimeException();
	}

}
