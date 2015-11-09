package framework;

import builder.*;

public class ThreadExample implements Runnable  {
	public static int counter = 0;

	public void run() {

	}

	public static class RunThisTing {

		public static void main(String args[]) {
			System.out.println("Starting thread");
			ThreadExample x = new ThreadExample();
			Thread y = new Thread(x);
			y.start();

		}

	}

	public ThreadExample() {
		try {
			System.out.println("Builder thread:");
			new BuildItBuilder();
			BuildItBuilder.BuildIt();

			Thread.sleep(100);
		} catch (InterruptedException ex) {
			System.out
					.println("Exception in builder thread:" + ex.getMessage());

		}
	}

}
