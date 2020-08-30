package com.mycode;

import org.apache.log4j.Logger;

public class MyClass
{
	public static Logger log = Logger.getLogger(MyClass.class.getName());
 
	public static void main(String[] args) {	 


    MyThread thread1 = new MyThread();
    MyThread1 thread2 = new MyThread1();


    log.info("logging stareted");
    thread1.start();
    thread2.start();
    
    MyThread2 thread3 = new MyThread2();
    
    log.info("logging Exception");
    thread3.start();
    try {
    	Thread.sleep(1000);
    } catch(Exception x) {
    	System.out.println("Caught it" +x);
    }
    System.out.println("Exiting Main");
	
    }
   
	
} 