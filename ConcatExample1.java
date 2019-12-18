package StringMethods;

public class ConcatExample1 {
	
	public static void main(String args[])
	{
		String s1="java string";
		s1.concat("is immutale");
		System.out.println(s1);//Prints "java string" because string is immutable
		s1=s1.concat("is immutale so assign it explicitly");//Prints "java string is immutable so assign it explicitly" here it will be assigned to an object
		System.out.println(s1);
	}

}
