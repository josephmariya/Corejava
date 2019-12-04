package corejava;

abstract class Animal1
{
	private String name;
	public Animal1(String name)
	{
		this.name=name;
	}
	public abstract void eat();
	public abstract void breathe();
	public String getName()
	{
		return name;
	}
}
class Racoon extends Animal1
{
	public Racoon(String name)
	{
		super(name);
	}
	public void eat()
	{
		System.out.println(getName()+" is eating");
	}
	public void breathe()
	{
		System.out.println("Breathe in,breathe out,repeat");
	}
}
public class abstraction {
	public static void main(String args[])
	{
		Racoon racoon=new Racoon("Racoon");
		racoon.eat();
		racoon.breathe();
	}

}
