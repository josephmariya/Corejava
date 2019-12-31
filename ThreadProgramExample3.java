package Thread;

public class ThreadProgramExample3 extends Thread {
    public static void main(String args[])
    {
    	ThreadProgramExample3 t1=new ThreadProgramExample3();//creating object for class
    	t1.start();//invoking run() method
    }
    public void run()
    {
    	System.out.println("Am in run method by extending thread");
    }
}
