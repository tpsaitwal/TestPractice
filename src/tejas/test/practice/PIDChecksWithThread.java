package tejas.test.practice;

class MyPIDChecks implements Runnable {

	@Override
	public void run() {
		for(int i = 0; i <=5 ; i++) {
			System.out.println(Thread.currentThread().getName() + ": "  + i);
			try {
				Thread.sleep(10000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}	
	}
}


public class PIDChecksWithThread {
	public static void main(String[] args) 
	{
		Thread t1 = new Thread(new MyPIDChecks());
		Thread t2 = new Thread(new MyPIDChecks());
		Thread t3 = new Thread(new MyPIDChecks());
		Thread t4 = new Thread(new MyPIDChecks());
		Thread t5 = new Thread(new MyPIDChecks());
		t1.start();
		try {
			Thread.sleep(5000);
			t2.start();
			Thread.sleep(6000);
			t3.start();
			Thread.sleep(4000);
			t4.start();
			Thread.sleep(2000);
			t5.start();
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}	
}
