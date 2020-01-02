package Thread;

public class DaemonthreadExample1 extends Thread{
	public void run()
	{
		if(Thread.currentThread().isDaemon()) {
			System.out.println("Daemon thread work.");
		}
		else
		{
			System.out.println("User thread work");
		}
	}
	public static void main(String[] args)
	{
		DaemonthreadExample1 t1=new DaemonthreadExample1();
		DaemonthreadExample1 t2=new DaemonthreadExample1();
		DaemonthreadExample1 t3=new DaemonthreadExample1();
		t1.setDaemon(true);//now t1 is daemon thread
		t1.start();//starting threads
		t2.start();
		t3.setDaemon(true);
		t3.start();
		
}

}
