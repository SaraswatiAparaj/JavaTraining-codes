package com.pkg;

public class TestOddEven {
	
	int i = 1;
	public void printOdd() throws InterruptedException
	{
		synchronized(this)
		{
			while( i < 10)
			{
				if(i%2 == 0)
				{
					wait();
				}
				Thread.sleep(500);
				System.out.println(i + " : "+Thread.currentThread().getName());
				i++;
				notifyAll();
			}
		}
	}

	
	public void printEven() throws InterruptedException
	{
		synchronized(this)
		{
			while( i < 10)
			{
				if(i%2 != 0)
				{
					wait();
				}
				Thread.sleep(500);
				System.out.println(i + " : "+Thread.currentThread().getName());
				i++;
				notifyAll();
			}
		}
	}
	
	
	public static void main(String[] arr)
	{
		TestOddEven obj = new TestOddEven();
		
		class T1 extends Thread
		{
			public void run()
			{
				try {
					obj.printOdd();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		
		T1 t1 = new T1();
		t1.setName("OddThread");
		
		
		class T2 extends Thread
		{
			public void run()
			{
				try {
					obj.printEven();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		
		T2 t2 = new T2();
		t2.setName("EvenThread");
		
		t1.start();
		t2.start();
	}
	
}

