package StringMethods;

public class CompareToExample2 {
	
	public static void main(String args[])
	{
		String s1="hello";
		String s2="";
		String s3="me";
		System.out.println(s1.compareTo(s2));//5 because it returns length of first string and also '+' is second string is empty
		System.out.println(s2.compareTo(s3));//-2 because it returns length of second string and also '-' is first string is empty
	}

}
