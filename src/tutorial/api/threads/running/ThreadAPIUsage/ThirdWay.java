package tutorial.api.threads.running.ThreadAPIUsage;

import java.util.concurrent.TimeUnit;

public class ThirdWay {
	
	public static void main (String[] args) {
		
		System.out.println("--- Main thread starts ---");
		
		new FourthTask();
		new FourthTask();
		
		System.out.println("--- Main thread ends ---");
		
	}
}

class ThirdTask implements Runnable {
	
	private static int count = 0;
	private int id;
	
	public ThirdTask() {
		this.id = ++count;
		new Thread(this).start();
	}
	
	@Override
	public void run() {
		
		for(int i = 10 ; i > 0 ; i--) {
			System.out.println("<" + id + "> TICK TICK " + i);
			
			try {
				TimeUnit.MILLISECONDS.sleep(200);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
	
}