package sar;

public class Throw1 {
	public static void main(String[] args)
	{
		System.out.println("Statement 1");
		System.out.println("Statement 2");
		
		try 
		{
			int i = 10/0;
			throw new ArithmeticException();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		finally 
		{
			System.out.println("finally Exicuted");
		}
		System.out.println("Statement 3");
		System.out.println("Statement 4");
		}

}

