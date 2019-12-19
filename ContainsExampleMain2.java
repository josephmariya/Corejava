package StringMethods;

public class ContainsExampleMain2 {
	
	public static void main(String args[])
	{
		String str="Hello F#A#C#E@2.0 readers";
		boolean isContains=str.contains("F#A#C#E");
		System.out.println(isContains);//true because it checks whether the substring contained in the string
		System.out.println(str.contains("FACe"));//false because it is case sensitive
	}

}
