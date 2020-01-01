package interfacesample;

public class inheritedclass1 implements interfacea1,interfacea2{
	//Implementation of abstract methods
	public void add(int a,int b) 
	{
		int result=a+b;
		System.out.println("Sum is :"+result);
	}
	public void sub(int a,int b)
	{
		int result=a-b;
		System.out.println("Difference is :"+result);
	}
	public void mul(int a,int b)
	{
		int result=a*b;
		System.out.println("Product is :"+result);
	}
	public void div(int a,int b)
	{
		int result=a/b;
		System.out.println("Division result is :"+result);
	}
}
