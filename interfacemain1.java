package interfacesample;
import java.util.Scanner;

public class interfacemain1 extends inheritedclass1{
	
	public static void main(String args[])
	{
		Scanner obj=new Scanner(System.in);
		System.out.println("Enter first number");
		int x=obj.nextInt();
		System.out.println("Enter second number");
		int y=obj.nextInt();
		inheritedclass1 ob=new inheritedclass1();
		ob.add(x,y);
		ob.sub(x,y);
		ob.mul(x,y);
		ob.div(x,y);
	}
 
}
 
