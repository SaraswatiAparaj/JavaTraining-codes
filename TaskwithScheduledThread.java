package com.pkg;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class TaskwithScheduledThread extends Thread
{
	public void run()
	{
		System.out.println("Thread "+Thread.currentThread().getName());
	}

	public static void main(String[] args) 
	{
		
		ExecutorService service = Executors.newScheduledThreadPool(10);
		for(int i=1;i<50;i++)
		{
		service.execute(new TaskwithScheduledThread());
		}
	}

}

