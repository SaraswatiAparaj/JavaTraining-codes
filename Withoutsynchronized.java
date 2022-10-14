
class synchronizeclas1
{
	int count=0;
	
	 int inc()
	{
		
		return count++;
	}
}


public class Withoutsynchronized
{
	public static void main(String[] args) throws InterruptedException 
	{
		
		
		class T1 extends Thread
		{
			synchronizeclas1 obj1 = new synchronizeclas1();

			public void run()
			{
				
				  for(int i=0;i<100;i++)
				  { obj1.inc(); 
					System.out.println(obj1.count);
				  }	
				
			}
		}


		class T2 extends Thread 
		 { 
			synchronizeclas1 obj2 = new synchronizeclas1();
			 public void run() 
			 { 
				 for(int i=0;i<100;i++) 
				 {
					 obj2.inc(); 
						System.out.println(obj2.count);
		 } } }
		 
		
		
		T1 ob = new T1();
	
		
		T2 ob1 = new T2();
		ob.start();
		ob.join();
	
		ob1.start();
		ob1.join();
		
	//	Thread.sleep(1000);
		
	}
}

