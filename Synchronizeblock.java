class synchronizeclas
{
	int count=0;
	
	synchronized int inc()
	{
		System.out.println("with Synchronized");
		synchronized(this)
		{
		return count++;
		}
	}
}


public class Synchronizeblock
{
	public static void main(String[] args) throws InterruptedException 
	{
	synchronizeclas obj1 = new synchronizeclas();

		
		
		class T1 extends Thread
		{
			public void run()
			{
				
				  for(int i=0;i<100;i++)
				  { obj1.inc(); 
				  }	
				
			}
		}


		class T2 extends Thread 
		 { 
			 public void run() 
			 { 
				 for(int i=0;i<100;i++) 
				 {
					 obj1.inc(); 
		 } 
				 }
		 }
		
		T1 ob = new T1();
	
		
		T2 ob1 = new T2();
		ob.start();
		ob.join();
	
		ob1.start();
		ob1.join();
		
	//	Thread.sleep(1000);
		System.out.println(obj1.count);
		
	}
}

