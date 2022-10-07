public class Doubletrycatch
{
	public static void main(String[] args) 
	{
		System.out.println("Statement 1");
		System.out.println("Statement 2");
	
		try 
		{
			try 
			{
			int i=10/0;
			
			}
		
		catch(Exception e)
		{
			System.out.println(e);
		}
			
			int[] arr = new int[5];
			System.out.println(arr[6]);
		}
		
		catch(Exception e)
		{
			System.out.println(e);
		}
		
		System.out.println("Statement 3");
		System.out.println("Statement 4");
	}
}

