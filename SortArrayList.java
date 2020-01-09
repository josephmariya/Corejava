package Collection;
import java.util.*;

public class SortArrayList {
   public static void main(String args[])
   {
	   Scanner obj=new Scanner(System.in);
	   System.out.println("Enter number of subjects ;");
	   int n=obj.nextInt();
	   ArrayList<Integer> marklist=new ArrayList<Integer>();   //Creating arraylist
	   for(int i=1;i<=n;i++)
	   {
		   int m=obj.nextInt();//Read marks
		   marklist.add(m);//Add items into arraylist
	   }
	   System.out.println(marklist);//Print arraylist
	   System.out.println("After sorting");
	   Collections.sort(marklist);//Sort arraylist
	   System.out.println(marklist);
   }
}
