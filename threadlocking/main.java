/**
 *
 * Thread Locking With ReeantrantLock & Runnable
 * @author Ryan Bond
 * https://github.com/ozone227 - drbond@gmail.com
 *
 */
import java.util.concurrent.locks.ReentrantLock;

public class Driver {

	// Create a ReeantrantLock
	static ReentrantLock lock = new ReentrantLock();

	// Create a Runnable Method for Counting Zero
	static Runnable r1 = new Runnable() {
		public void run(){
			System.out.println("Count to Twenty");
			for (int i= 0; i <= 20; i++){
			System.out.println(i);
			};
		};
	};

	// Create a Runnable Method for Counting Down to Zero
		static Runnable r2 = new Runnable(){
			public void run(){
				System.out.println("Countdown to Zero");
				for (int i=20; i>=0; i--){
				System.out.println(i);
				};
			};
		};

	public static void main(String[] args) throws InterruptedException {
		// Build the Threads
		Thread th1 = new Thread(r1);
		Thread th2 = new Thread(r2);

		// Aquire the Lock & Start the Threads
		try {
			lock.lock();
			th1.start();
			lock.unlock();
			th2.start();
	      // Catch all Exceptions & Throw a Stack Trace
		} catch (Exception e){e.printStackTrace();
		} finally {
		 // Join the Threads
			th1.join();
			th2.join();
		}
	}
}
