package Exceptionhandling;
class Test extends Exception{}
public class ExceptionHandlingExample2 {
	public static void main(String args[])
	{
		try
		{
			throw new Test();
		}
		catch(Test t)
		{
			System.out.println("Got the test exception");
		}
		finally
		{
			System.out.println("Inside finally block ");
		}
	}

}
