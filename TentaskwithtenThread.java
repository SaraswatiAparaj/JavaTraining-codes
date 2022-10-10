public class TentaskwithtenThread extends Thread
{
	
	public void run()
	{
		System.out.println("Thread "+Thread.currentThread().getName());
	}

	public static void main(String[] args) 
	{
		for(int i=1;i<10;i++)
		{
		TentaskwithtenThread t1 = new TentaskwithtenThread();
		t1.start();
		}
	}

}
