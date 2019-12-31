package Thread;
class MusicPlayer extends Thread
{
	public void run()
	{
	   System.out.println("Music is playing");
	}
}
class MsWord implements Runnable
{
	public void run()
	{
	   System.out.println("Typing Ms Word document");
	}
}
public class ThreadProgramExample2 {
	public static void main(String args[])
	{
		MusicPlayer thread1=new MusicPlayer();//Creating thread for extends thread class
		Runnable obj1=new MsWord();//Creating object for runnable interface
		Thread thread2=new Thread(obj1);//Invokes thread class constructor
		thread1.start();
		thread2.start();
	}


}
