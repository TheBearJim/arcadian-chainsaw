package framework;
import builder.*;
public class ThreadExample implements Runnable {
	public static int counter = 0;

	public ThreadExample() {
	}

	public void run() {
		while (ThreadExample.counter <= 0) {
			try {
				System.out.println("" + (++ThreadExample.counter));
				Thread.sleep(100);
			} catch (InterruptedException ex) {
				System.out.println("Exception in thread:" + ex.getMessage());

			}
		}
	}

	public static class RunThisTing {
		public static void main(String args[]) {
			System.out.println("Starting thread");
			ThreadExample x = new ThreadExample();
			Thread y = new Thread(x);
			y.start();
			while (ThreadExample.counter <= 0) {
				try {
					new BuildItBuilder();
					BuildItBuilder.main(args);
					
					System.out.println("Main thread:"
							+ (++ThreadExample.counter));
					Thread.sleep(100);
				} catch (InterruptedException ex) {
					System.out.println("Exception in  main thread:"
							+ ex.getMessage());

				}
			}

		}
	}
}

