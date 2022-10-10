import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class HundredtaskwithCacheThread extends Thread
{
	public void run()
	{
		System.out.println("Thread  "+Thread.currentThread().getName());
	}

	public static void main(String[] args) 
	{
		ExecutorService service = Executors.newCachedThreadPool();
		
		for(int i=0;i<100;i++)
		{
			service.execute(new HundredtaskwithCacheThread());
		}
	}

}

