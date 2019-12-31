package Thread;
class Numbers2 implements Runnable
{
	public void run()
	{
		for(int i=0;i<4;i++)
		{
			System.out.println(i);
		}
	}
}
public class Runnableinterface {
	public static void main(String args[])
	{
		Runnable obj1=new Numbers2();
		//Numbers2 obj1=new Numbers2();
		Numbers2 obj2=new Numbers2();
		Thread thread1=new Thread(obj1);
		Thread thread2=new Thread(obj2);
		thread1.start();
		thread2.start();
	}
	

}
