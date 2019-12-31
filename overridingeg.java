package corejava;
import java.util.Scanner;
class Animal//Base class
{
	public void animalsound() //method overrided
	{
		System.out.println("Sounds of different animals");
	}
}
class Lion extends Animal//inherited class
{
	public void animalsound()//method overrided
	{
		System.out.println("The Loin roars");
	}
}
class Cat extends Animal//inherited class
{
	public void animalsound()//method overrided
	{
		System.out.println("The Cat meows");
	}
}
public class overridingeg {
	
	public static void main(String args[])
	{
		Animal a=new Animal();//object for parent class
		Animal l=new Lion();//Creates object for Animal class invoking Lion class constructor
		Animal c=new Cat();//Creates object for Animal class invoking Cat class constructor
		a.animalsound();//invokes parent class method
		l.animalsound();//invokes lion class method
		c.animalsound();//invokes Cat class method
	}

}
