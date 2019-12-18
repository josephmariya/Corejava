package StringMethods;

public class CharAtExample3 {
  
	public static void main(String args[])
	{
		String str="Welcome to FACE portal";
		int l=str.length();//To find length of string
		System.out.println("Character at 1 index is :"+str.charAt(1));//Fetching first index character
		System.out.println("Character at last index is :"+str.charAt(l-1));//The last character is present at l-1 index.
	}

}
