import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Hundredtaskwith1Thread extends Thread
{

	public void run()
	{
		System.out.println("Thread  "+Thread.currentThread().getName());
	}
	public static void main(String[] args) 
	{
		
		ExecutorService service = Executors.newSingleThreadExecutor();
		
		for(int i=0;i<10;i++)
		{
			service.execute(new Hundredtaskwith1Thread());
		}
	}

}

