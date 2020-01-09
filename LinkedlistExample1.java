package Collection;
import java.util.*;
public class LinkedlistExample1 {
	public static void main(String[] args) {
	    Scanner obj=new Scanner(System.in);
		LinkedList<String> al1=new LinkedList<String>();
		System.out.println("Enter number of elements in linked list :");
		int n1=obj.nextInt();
		System.out.println("Enter values:");
		for(int i=0;i<n1;i++)
		{
	      String s1=obj.next();
	      al1.add(s1);
		}
		ArrayList<String> al2=new ArrayList<String>();
     	System.out.println("Enter number of elements in array list:");
		int n2=obj.nextInt();
		System.out.println("Enter values:");
		for(int i=0;i<n2;i++)
		{
	      String s2=obj.next();
	      al2.add(s2);
		}
        System.out.println("Actual linked list :"+al1);  
       System.out.println(al2); 
       al1.addAll(al2);
       System.out.println("After Copy :"+al1); 
	}
}
