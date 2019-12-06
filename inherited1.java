package abstraction;

public class inherited1 extends abstractclass1 {

     void add(int a,int b)
	{
		int sum=a+b;
		System.out.println("Sum is :"+sum);
	}
    public void substract(int a,int b)
	{
		super.substract(a,b);
	}
}
