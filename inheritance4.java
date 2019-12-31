package corejava;
import java.util.Scanner;
class A //Base class
{
	public void add(int a,int b) //Method overriding
	{
		int n=a+b;
		System.out.println("Sum is : "+n);
	}
}
public class  inheritance4 extends A{  //Child class
	int a,b;
	public void add(int a,int b) //Method overriding
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
		A ob=new inheritance4();//Creating object for parent class by invoking child class constructor
		ob.add(a,b);//it checks add() method in child class first then looks it present in base class if it is present then load the child class add() method
	}
	
	
}
	


