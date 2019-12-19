package StringMethods;

public class ContainsExampleMain1 {

	public static void main(String args[])
	{
		String name="what do you know about me";
		System.out.println(name.contains("do you know"));//true because it checks whether the substring contained in the string name.
		System.out.println(name.contains("about"));//true
		System.out.println(name.contains("hello"));//false
	}
}
