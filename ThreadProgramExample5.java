package Thread;

public class ThreadProgramExample5 extends Thread {
	public void run()
	{
		try
		{
			System.out.println(" Music Player is Running");
			Thread.sleep(1000);
		}
		catch(InterruptedException e)
		{
			System.out.println(" Received a whatsapp notification");
		}
	}
	public static void main(String args[])
	{
		ThreadProgramExample5 t=new ThreadProgramExample5();
		t.start();//here thread is started
		t.interrupt();
	}

}

