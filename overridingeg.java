package corejava;
import java.util.Scanner;
class Animal
{
	public void animalsound()
	{
		System.out.println("Sounds of different animals");
	}
}
class Lion extends Animal
{
	public void animalsound()
	{
		System.out.println("The Loin roars");
	}
}
class Cat extends Animal
{
	public void animalsound()
	{
		System.out.println("The Cat meows");
	}
}
public class overridingeg {
	
	public static void main(String args[])
	{
		Animal a=new Animal();
		Animal l=new Lion();
		Animal c=new Cat();
		a.animalsound();
		l.animalsound();
		c.animalsound();
	}

}
