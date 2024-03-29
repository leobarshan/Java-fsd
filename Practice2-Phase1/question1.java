package assignment2;

class MyT1 extends Thread 
{
	 public void run()
	 {
	     System.out.println("Thread created by extending Thread class.");
	 }
}

	class MyT2 implements Runnable 
	{
	 public void run() 
	 {
	     System.out.println("Thread created by implementing Runnable interface.");
	 }
}

	public class question1{
	 public static void main(String[] args) {
	     MyT1 thread1 = new MyT1();  
	     MyT2 myRunnable = new MyT2();
	     Thread thread2 = new Thread(myRunnable);    
	     thread1.start();
	     thread2.start();
	 }
	}
