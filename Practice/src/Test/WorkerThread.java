package Test;

public class WorkerThread implements Runnable{
	private String msg;
	public WorkerThread(String s){
		this.msg = s;
	}
	public void run(){
	System.out.println(Thread.currentThread().getName()+" Starts : "+ msg);
	process();
	System.out.println(Thread.currentThread().getName()+" Ends ");
	}
	
	public void process()
	{
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			System.out.println(e);
		}
	}

}
