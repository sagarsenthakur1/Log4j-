package com.mycode;

import org.apache.log4j.Logger;

class MyThread1 extends Thread implements MyInterface
{
	public static Logger log = Logger.getLogger(MyThread1.class.getName());
	
@Override
public void run()
{
    int i = 0;
    while(i < 2)
    {
        System.out.println(Thread.currentThread().getId()+" In secound thread");
        log.info(Thread.currentThread().getId());
        log.debug("debug");
        System.out.println();
        i++;
    }
}
}
