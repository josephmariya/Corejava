package Thread;

public class ThreadUsingInterface implements Runnable{
	 public static void main(String args[])
	    {
		 ThreadUsingInterface ts=new ThreadUsingInterface();//creating object for class
	     Thread t1=new Thread(ts);	
		 t1.start();//invoking run() method
	    }
	    public void run()
	    {
	    	System.out.println("Am in run method by implementing runnable");
	    }
}
