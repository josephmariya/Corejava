package corejava;

import java.util.Scanner;

public class classobj2a {
	public String name,address,ph,email,ptype,pid;//data members
	public  classobj2a(String name,String address,String ph,String email,String ptype,String pid)//constructor
	{
		this.name=name;
		this.address=address;
		this.ph=ph;
		this.email=email;
		this.ptype=ptype;
		this.pid=pid;
	}
	public void register()//member function
	{
		
		System.out.println("Thank you for registering.Your details are as follows :");
		System.out.println("Name :"+name);
		System.out.println("Address :"+address);
		System.out.println("Contact Number :"+ph);
		System.out.println("Email ID :"+email);
		System.out.println("Proof Type :"+ptype);
		System.out.println("Proof ID :"+pid);
		
	}
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
		classobj2a ob=new classobj2a(name,address,ph,email,ptype,pid);//invoking constructor
		ob.register();//invoking member function using object
		
	}


}
