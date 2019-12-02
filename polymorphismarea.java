package corejava;
import java.util.Scanner;
public class polymorphismarea {
	
	public void findarea(float r)
	{
		float a=(float)(3.14*r*r);
		System.out.println("Area of circle is :"+a);
	}
    public void findarea(int l,int b)
    {

		int a=l*b;
		System.out.println("Area of rectangle is :"+a);
    }
    public void findarea(int s)
    {
    	int a=s*s;
		System.out.println("Area of square is :"+a);
    }
    public void findarea(float base,float h)
    {
    	float a=(float)(0.5*base*h);
		System.out.println("Area of triangle is :"+a);
    }
    public static void main(String args[])
    {
    	Scanner obj=new Scanner(System.in);
    	polymorphismarea ob=new polymorphismarea();
    	String s1;
    	do
    	{
    		System.out.println("\nSelect your choice :\n1.Area of Circle\n2.Area of Rectangle\n3.Area of Square\n4.Area of Triangle");
    		int ch=obj.nextInt();
    		switch(ch)
    		{
    		case 1:
    	             System.out.println("\nEnter radius of circle :");
    	             float r=obj.nextFloat();
    	             ob.findarea(r);
    	             break;
    		case 2:
                   	 System.out.println("\nEnter length of rectangle :");
    	             int l=obj.nextInt();
    	             System.out.println("Enter breadth of rectangle :");
    	             int b=obj.nextInt();
    	             ob.findarea(l,b);
    	             break;
    		case 3:
    	             System.out.println("\nEnter side of square :");
    	             int s=obj.nextInt();
    	             ob.findarea(s);
    	             break;
    		case 4:
    	             System.out.println("\nEnter base of triangle :");
    	             float base=obj.nextFloat();
    	             System.out.println("Enter height of triangle :");
    	             float h=obj.nextFloat();
    	             ob.findarea(base,h);
    	             break;
    	    default :  System.out.println("Invalid");
    	    
    		}
    		obj.nextLine();
    		System.out.println("Do you want to continue?(y/n)");
    		s1=obj.nextLine();
    	}while((s1.equals("y"))||(s1.equals("Y")));
    	
    }
    
}
