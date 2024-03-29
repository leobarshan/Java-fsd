package assignment2;

class SleepThread extends Thread {
    public void run() {
        System.out.println("SleepThread: Starting...");
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            System.out.println("SleepThread: Interrupted while sleeping");
        }
        System.out.println("SleepThread: Finished.");
    }
}

class WaitThread extends Thread {
    private Object lock;
    public WaitThread(Object lock) {
        this.lock = lock;
    }
    public void run() {
        System.out.println("WaitThread: Starting...");
        synchronized (lock) {
            try {
                System.out.println("WaitThread: Waiting for notify...");
                lock.wait();
            } catch (InterruptedException e) {
                System.out.println("WaitThread: Interrupted while waiting");
            }
            System.out.println("WaitThread: Resumed.");
        }
        System.out.println("WaitThread: Finished.");
    }
}
public class question2
{
    public static void main(String[] args) {
        System.out.println("Main: Starting SleepThread...");
        SleepThread sleepThread = new SleepThread();
        sleepThread.start();       
        Object lock = new Object();
        System.out.println("Main: Starting WaitThread...");
        WaitThread waitThread = new WaitThread(lock);
        waitThread.start();
        try {
            Thread.sleep(2000);
        } 
        catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Main: Interrupting WaitThread...");
        waitThread.interrupt();
        synchronized (lock) {
            System.out.println("Main: Notifying WaitThread...");
            lock.notify();
        }

        System.out.println("Main: Finished.");
    }
}

