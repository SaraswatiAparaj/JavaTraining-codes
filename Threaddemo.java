class class1 extends Thread
{
	public void run()
	{
		System.out.println("custom Thread"+Thread.currentThread().getName());
		for(int i=1;i<11;i++)
		{
			System.out.println(i);
		}
		
	}

}

class mainMethod extends Thread
{
	public void run()
	{
		//System.out.println("custom Thread"+Thread.currentThread().getName());
		for(int i=1;i<11;i++)
		{
			System.out.println(i);
		}
		
	}

}



class Threaddemo
{
	public static void main(String[] args) throws InterruptedException 
	{
		class1 thread = new class1();
		mainMethod Thread = new mainMethod();
		
		//to give name for thread
		thread.setName("sar");
		thread.start();	
		thread.join();
		Thread.start();	

		System.out.println("Main Thread"+Thread.currentThread().getName());
		
		
	}

}

