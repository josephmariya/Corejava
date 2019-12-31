
package Thread;
import java.lang.*;
public class ThreadProgramExample4 implements Runnable {
	Thread t;
	ThreadProgramExample4()
	{
		t=new Thread(this);
		System.out.println("Executing "+t.getName());
		t.start();//this will call run() function
		t.interrupt();
	}
	public void run()
	{
		try
		{
			while(true)
			{
				Thread.sleep(1000);
			}
		}
		catch(InterruptedException e)
		{
			System.out.println(t.getName()+" Interrupted");
		}
	}
	public static void main(String args[])
	{
		new ThreadProgramExample4();
	}

}
