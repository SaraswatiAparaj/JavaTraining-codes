public class Customizedexception 
{
	public static void main(String[] args)
	{
		System.out.println("Statement 1");
		System.out.println("Statement 2");
		
		try
		{
			//int i= 10/0;
			int age=10;
			if(age<18)
			{
				throw new InvalidAgeException("you are minor");
			}
			else
			{
				System.out.println("you are Eligible");
			}
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
class InvalidAgeException extends Exception
{
	InvalidAgeException(String str)
	{
	super(str);
	}
}


