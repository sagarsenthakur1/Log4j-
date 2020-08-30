package com.mycode;

import org.apache.log4j.Logger;

class MyThread extends Thread implements MyInterface

  {
	
	public static Logger log = Logger.getLogger(MyThread.class.getName());
	
	@Override
   public void run()
    {
    int i = 0;
    while(i < 2)
    {
        System.out.println(Thread.currentThread().getId()+" In first thread");
        log.info(Thread.currentThread().getId());
        log.error(Thread.currentThread().getId());
        System.out.println();
        i++;
    }   

  }
}