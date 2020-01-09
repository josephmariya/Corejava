package Collection;
import java.util.*;
class Contacts
{
	private String name;
	private int ph;
	public void setname(String name)
	{
		this.name=name;
	}
	public void setph(int ph)
	{
		this.ph=ph;
	}
	public String getname()
	{
		return name;
	}
	public int getph()
	{
		return ph;
	}
}
public class UserdefinedArraylist {
   public static void main(String args[])
   {
	   Contacts ob1=new Contacts();
	   ob1.setname("tim");
	   ob1.setph(181888424);
	   Contacts ob2=new Contacts();
	   ob2.setname("john");
	   ob2.setph(181888425);
	   ArrayList<Contacts> contactlist=new ArrayList<Contacts>();
	   contactlist.add(ob1);
	   contactlist.add(ob2);
	   System.out.println(contactlist.get(0).getname()+" "+contactlist.get(0).getph());
	   System.out.println(contactlist.get(1).getname()+" "+contactlist.get(1).getph());
   }
}
