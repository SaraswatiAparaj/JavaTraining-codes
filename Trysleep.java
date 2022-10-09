public class Trysleep extends Thread
{

static int count=0;
	
	void increase()
	{
		count++;
	}
	
	void decrease()
	{
		count--;
	}
	
	public void run()
	{
		increase();
		System.out.println(count);
		decrease();
		System.out.println(count);
	}
	
	
	public static void main(String[] args) 
	{
		Trysleep thread1=new Trysleep();
		thread1.start();
		Trysleep thread2=new Trysleep();
		thread2.start();
	}
}

