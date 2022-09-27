package sar;

public class trycatch1 {
	public static void main(String[] args)
	{
		System.out.println("statement 1");
		System.out.println("statement 2");
		try 
		{
			int i=10/0;
			//int[] arr = new int[5];
			//System.out.println(arr[6]);
		}
		catch(ArithmeticException e)
		{
			System.out.println(e);
		}
		finally
		{
			System.out.println("finally Excicuted");
		}
		System.out.println("statement 3");
		System.out.println("statement 4");


	}

}

