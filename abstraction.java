package corejava;

abstract class Animal1//abstract class
{
	private String name;
	public Animal1(String name)
	{
		this.name=name;
	}
	public abstract void eat();//abstract method
	public abstract void breathe();//abstract method
	public String getName()
	{
		return name;
	}
}
class Racoon extends Animal1//inherited class
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
