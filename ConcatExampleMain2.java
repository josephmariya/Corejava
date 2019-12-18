package StringMethods;

public class ConcatExampleMain2 {
	
	public static void main(String args[])
	{
		String s1="Hello";
		String s2="Face@2.0";
		String s3="Reader";
		String s4=s1.concat(s2);//Concatenating one string
		System.out.println(s4);
		String s5=s1.concat(s2).concat(s3);//Concatenating multiple strings
		System.out.println(s5);
	}


}
