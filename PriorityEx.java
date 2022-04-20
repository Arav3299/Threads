package com.assignment;

class MyPriority extends Thread{
	public void run(){
		System.out.println("ThreadName is "+Thread.currentThread().getName()+
		"Thread Priority is "+Thread.currentThread().getPriority());
	}
}
public class PriorityEx {

	public static void main(String[] args){
		MyPriority myPriority = new MyPriority();
	
		System.out.println("Before Setting Priotiy");
		Thread thread1 = new Thread(myPriority);
		Thread thread2 = new Thread(myPriority);
		Thread thread3 = new Thread(myPriority);
		thread1.start();
		thread2.start();
		thread3.start();
//		System.out.println("After Setting Priotiy");
		thread1.setPriority(10);
		thread2.setPriority(5);
		thread3.setPriority(1);
		
		thread1.start();
		thread2.start();
		thread3.start();
		
		
		
		
	}
}
