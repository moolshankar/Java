package Test;

public class TestThreadGroup implements Runnable {
	public void run(){
		System.out.println(Thread.currentThread().getName());
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TestThreadGroup runnable = new TestThreadGroup();
		ThreadGroup tg1 = new ThreadGroup("Parent ThreadGroup");
		Thread t1 = new Thread(tg1,runnable," first ");
		t1.start();
		Thread t2 = new Thread(tg1,runnable," second ");
		t2.start();
		Thread t3 = new Thread(tg1,runnable," Third ");
		t3.start();
		System.out.println(tg1.getName());
		tg1.list();
	}

}
