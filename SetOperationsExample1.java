package Collection;
import java.util.*;
public class SetOperationsExample1 {
    public static void main(String args[])
    {
    	Scanner obj=new Scanner(System.in);
    	Set<Integer> set1=new HashSet<Integer>();//Create set
    	Set<Integer> set2=new HashSet<Integer>();
    	System.out.println("Enter number of elements in set1 :");
    	int n1=obj.nextInt();
    	int i;
    	for(i=0;i<n1;i++)
    	{
    		int a=obj.nextInt();//Add items into set
    		set1.add(a);
    	}
    	System.out.println("Enter number of elements in set2 :");
    	int n2=obj.nextInt();
    	for(i=0;i<n2;i++)
    	{
    		int b=obj.nextInt();
    		set2.add(b);
    	}
    	System.out.println(set1);//Print set
    	System.out.println(set2);
    	//To find union
    	Set<Integer> union=new HashSet<Integer>(set1);
    	union.addAll(set2);
    	System.out.println(union);
    	//To find intersection
    	Set<Integer> intersection=new HashSet<Integer>(set1);
    	intersection.retainAll(set2);
    	System.out.println(intersection);
    	//To find symmetric difference
    	Set<Integer> symmetricdifference=new HashSet<Integer>(set1);
    	symmetricdifference.removeAll(set2);
    	System.out.println(symmetricdifference);
    }
}
