package corejava;
import java.util.Scanner;
class A
{
	public void add(int a,int b)
	{
		int n=a+b;
		System.out.println("Sum is : "+n);
	}
}
public class  inheritance4 extends A{
	int a,b;
	public void add(int a,int b)
	{
		int n=a+b+10;
		System.out.println("Sum is : "+n);
	}
	public static void main(String args[])
	{
		Scanner obj=new Scanner(System.in);
		System.out.println("Enter first number: ");
		int a=obj.nextInt();
		System.out.println("Enter second number: ");
		int b=obj.nextInt();
		A ob=new inheritance4();
		ob.add(a,b);
	}
	
	
}
	


