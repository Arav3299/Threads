package com.assignment;

class MyThread implements Runnable{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("Thread is Now "+Thread.currentThread().getName());
	}
	
}
public class RunnableEx {
	public static void main(String[] a){
	MyThread myThread = new MyThread();
	Thread thread = new Thread(myThread);
	thread.start();
}
}
