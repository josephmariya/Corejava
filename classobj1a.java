package corejava;
import java.util.Scanner;
public class classobj1a {
	public String name,address,ph,email,ptype,pid;//data members
	
	public static void main(String args[])
	{
		Scanner obj=new Scanner(System.in);
		classobj1a ob=new classobj1a();//object of classobj1a is created
		//Read values into 
		System.out.println("Enter your name:");
	        ob.name=obj.nextLine();
		System.out.println("Enter your address:");
		ob.address=obj.nextLine();
		System.out.println("Enter your Contact Number:");
		ob.ph=obj.nextLine();
		System.out.println("Enter your Email id:");
		ob.email=obj.nextLine();
		System.out.println("Enter your Proof type:");
		ob.ptype=obj.nextLine();
		System.out.println("Enter your Proof id:");
		ob.pid=obj.nextLine();
		System.out.println("Thank you for registering.Your details are as follows :");
		System.out.println("Name :"+ob.name);
		System.out.println("Address :"+ob.address);
		System.out.println("Contact Number :"+ob.ph);
		System.out.println("Email ID :"+ob.email);
		System.out.println("Proof Type :"+ob.ptype);
		System.out.println("Proof ID :"+ob.pid);
	}

}
