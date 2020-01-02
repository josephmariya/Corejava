package Thread;

public class DaemonthreadExample2 extends Thread{
	public void run()
	{
		System.out.println("Thread name :"+Thread.currentThread().getName());
		System.out.println("Check if its DaemonThread: "+Thread.currentThread());
	}
    public static void main(String args[])
    {
    	DaemonthreadExample2 t1=new DaemonthreadExample2();
    	DaemonthreadExample2 t2=new DaemonthreadExample2();
    	t1.start();
    	//Exception as the thread is already started
    	t1.setDaemon(true);
    	t2.start();
    }
}
