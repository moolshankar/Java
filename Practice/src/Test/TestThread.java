package Test;

public class TestThread implements Runnable{
	public void run(){
		System.out.println("Thread is running");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TestThread r1 = new TestThread();
		Thread t1 = new Thread(r1);
		t1.start();
	}

}
