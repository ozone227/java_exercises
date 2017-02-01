/**
 *
 * Exercise in Concurrency and Threading
 * @author Ryan Bond
 * https://github.com/ozone227 - drbond@gmail.com
 */



public class Driver {

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
			}
		};

	public static void main(String[] args) {
		// Build and Start Threads
		Thread th1 = new Thread(r1);
		Thread th2 = new Thread(r2);
		th1.start();
		th2.start();
}
}
