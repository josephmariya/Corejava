package corejava;

public class classobj3b {

	public String name,address,ph,email,ptype,pid;//declaring data members
	//set method is used to set values into variables
	public void setname(String name)
	{
		this.name=name;
	}
	public void setaddress(String address)
	{
		this.address=address;	
	}
	public void setph(String ph)
	{
		this.ph=ph;
	}
	public void setemail(String email)
	{
		this.email=email;
	}
	public void setptype(String ptype)
	{
		this.ptype=ptype;	
	}
	public void setpid(String pid)
	{
		this.pid=pid;	
	}
	//get method is used to get value from variable
	public String getname()
	{
		return this.name;	
	}
	public String getaddress()
	{
		return this.address;
	}
	public String getph()
	{
		return this.ph;	
	}
	public String getemail()
	{
		return this.email;	
	}
	public String getptype()
	{
		return this.ptype;
	}
	public String getpid()
	{
		return this.pid;
	}

}
