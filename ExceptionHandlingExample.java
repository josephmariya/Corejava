package Exceptionhandling;

public class ExceptionHandlingExample {
	static void check() throws ArithmeticException//Declaring exception
	{
		System.out.println("Inside check function");
		throw new ArithmeticException("FACE Kollam");//Exception throw to catch block
	}
    public static void main(String args[])
    {
    	try
    	{
    		check();
    	}
    	catch(ArithmeticException e)//It handles exception
    	{
    		System.out.println("caught "+e);
    	}
    }
}
