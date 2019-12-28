package abstraction;

public abstract class abstractclass1 {     //Abstract class
	
     abstract void add(int a,int b);       //Abstract method
     public void substract(int a,int b)    //Concrete method
 	{
 		int result=a-b;
 		System.out.println("Difference is :"+result);
 	}
    
}
