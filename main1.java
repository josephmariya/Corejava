package abstraction;
import java.util.Scanner;
public class main1 {
	 
	public static void main(String args[])
	{
	  Scanner obj=new Scanner(System.in);
	  System.out.println("Enter first number :");
	  int a=obj.nextInt();
	  System.out.println("Enter second number :");
	  int b=obj.nextInt();
	  abstractclass1 ob=new inherited1();
	  ob.add(a,b);
	  ob.substract(a,b);
	}
}
