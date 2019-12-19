package StringMethods;

import java.util.ArrayList;

public class EqualsExampleMain2 {

	public static void main(String args[])
	{
		String str1="FACENXT";
		ArrayList<String> list=new ArrayList<>();//Declaring arraylist
		list.add("FACE");//Add items to the list
		list.add("FACEPREP");
		list.add("FACENXT");
		list.add("FACENOW");
		for(String str : list)//Checks whether str1 is present or not in a list using for-each loop
		{
			if(str.equals(str1))
			{
				System.out.println("FACENXT is present");
			}
		}
		
	}
}
