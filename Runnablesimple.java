public class Runnablesimple implements Runnable
{
	public void run()
	{
		System.out.println("thread"+Thread.currentThread().getName());
	}

	public static void main(String[] args)
	{
		System.out.println("charu"+Thread.currentThread().getName());
		
		Runnablesimple ob1=new Runnablesimple();
		Runnablesimple ob2=new Runnablesimple();
		
		//ob1.start();
		//ob2.start();
		Thread t1=new Thread(ob2);
		Thread t2=new Thread(ob1);
		t1.start();
		t2.start();

	}

}

