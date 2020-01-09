package Collection;
import java.util.*;
public class ReverseList {
    public static void main(String args[])
    {
    	Scanner obj=new Scanner(System.in);
    	ArrayList<String> stationary=new ArrayList<String>();//Creating arraylist
    	System.out.println("Enter number of items :");
    	int n=obj.nextInt();
    	int i;
    	String str=null;
    	for(i=0;i<n;i++)
    	{
    		str=obj.next();
    		stationary.add(str);//Add item into list
    	}
    	System.out.println(stationary);//Print list
    	//ArrayList<String> rev_stationary=new ArrayList<String>();
    	for(i=n-1;i>=0;i--)//Print list in a reverse order
    	{
    		//rev_stationary.add(stationary.get(i));
    	    System.out.println(stationary.get(i));//print item names
    	}
    	//System.out.println(rev_stationary);
    }
}
