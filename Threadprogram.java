package Thread;
class Numbers extends Thread
{
	public void run()
	{
		for(int i=0;i<10;i++)
		{
			System.out.println("Thread1 is running : "+i);
		}
	}
}
class Numbers1 extends Thread
{
	public void run()
	{
		for(int i=10;i<20;i++)
		{
			System.out.println("Thread2 is running : "+i);
		}
	}
}
public class Threadprogram {
	public static void main(String args[])
	{
		Numbers thread1=new Numbers();
		Numbers1 thread2=new Numbers1();
		thread1.start();
		thread2.start();
	}

}


