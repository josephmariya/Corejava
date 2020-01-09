package Collection;
import java.util.*;
class Contact
{
private String name;
private String phoneNumber;
public Contact(String name,String phoneNumber)
{
this.name=name;
this.phoneNumber=phoneNumber;
}
public String getname()
{
return this.name;
}
public String getphoneNumber()
{
return this.phoneNumber;
}
}
public class UserdefinedArraylistusingconstructor
{
	public static void main(String[] args)
	{

	ArrayList<Contact> contact=new ArrayList<Contact>();
	Contact firstContact=new Contact("mariya","812902909");
	Contact secondContact=new Contact("ancy","9947896111");
	contact.add(firstContact);
	contact.add(secondContact);
	for(int i=0;i<contact.size();i++)
	{
	System.out.println( contact.get(i).getname()+" "+ contact.get(i).getphoneNumber());
	}

	}

}

