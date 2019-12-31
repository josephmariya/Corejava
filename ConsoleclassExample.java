package Consoleclass1;
import java.io.Console;
public class ConsoleclassExample {

	 public static void main(String args[])
	 {
		 String str;
		 Console con=System.console();//creating object for console class
		 if(con==null)
		 {
			 System.out.print("No console available");
			 return;
		 }
		 str=con.readLine("Enter your name: ");
		 System.out.print(str);
		 System.out.println("Enter the password: ");
		 char[] ch=con.readPassword();//password can be read as a character array
		 String pass=String.copyValueOf(ch);
		 System.out.println("Password is: "+pass);
	 }
}
