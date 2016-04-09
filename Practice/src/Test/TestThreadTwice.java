package Test;

public class TestThreadTwice extends Thread {
	public void run(){
		System.out.println(Thread.currentThread().getName());
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TestThreadTwice t1 = new TestThreadTwice();
		//TestThreadTwice t2 = new TestThreadTwice();
		t1.start();
		//t1.start();
		//System.out.println("Name of t1:"+t1.getName());  
		//  System.out.println("Name of t2:"+t2.getName());  
		//  System.out.println("id of t1:"+t1.getId());
	}

}
