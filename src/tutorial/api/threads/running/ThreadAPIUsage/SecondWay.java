package tutorial.api.threads.running.ThreadAPIUsage;

import java.util.concurrent.TimeUnit;

public class SecondWay {
	
	public static void main (String[] args) {
		
		System.out.println("--- Main thread starts ---");
		
		new SecondTask().start();
		
		Thread t = new SecondTask();
		t.start();
		
		System.out.println("--- Main thread ends ---");
		
	}
}

class SecondTask extends Thread {
	
	private static int count = 0;
	private int id;
	
	public SecondTask() {
		this.id = ++count;
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