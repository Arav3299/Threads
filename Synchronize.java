package com.assignment;

class Dummy extends Thread
{
   static private int i = 0;
    public synchronized void increment()
    {
        i++;
    }
    @Override
 public  void run() {
    	System.out.println("Curren thread is "+this.currentThread().getName());
    	increment();
 }
    
    public int getValue()
    {
        return i;
    }
}
public class Synchronize{

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		Dummy thread = new Dummy();
	    
	        thread.start();
	        
	    Dummy thread1 = new Dummy();
	        
	    	thread1.start();
	         
	    Thread.sleep(1000);
	    System.out.println("i VALUE IS"+thread.getValue());  
	    System.out.println(thread1.getValue());
	    } 

	}

