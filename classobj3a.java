package corejava;

import java.util.Scanner;

public class classobj3a {
	public static void main(String args[])
	{
		Scanner obj=new Scanner(System.in);
		System.out.println("Enter your name:");
	        String name=obj.nextLine();
		System.out.println("Enter your address:");
		String address=obj.nextLine();
		System.out.println("Enter your Contact Number:");
		String ph=obj.nextLine();
		System.out.println("Enter your Email id:");
		String email=obj.nextLine();
		System.out.println("Enter your Proof type:");
		String ptype=obj.nextLine();
		System.out.println("Enter your Proof id:");
		String pid=obj.nextLine();
		classobj3b ob=new classobj3b();//Creating object for class classobj3b
		//set function is used to set values to variables
		ob.setname(name);
		ob.setaddress(address);
		ob.setph(ph);
		ob.setemail(email);
		ob.setptype(ptype);
		ob.setpid(pid);
		System.out.println("Thank you for registering.Your details are as follows :");
		//get function is used to read values from variables
		System.out.println("Name: "+ob.getname());
		System.out.println("Address :"+ob.getaddress());
		System.out.println("Contact Number :"+ob.getph());
		System.out.println("Email ID :"+ob.getemail());
		System.out.println("Proof Type :"+ob.getptype());
		System.out.println("Proof ID :"+ob.getpid());
	}


}
