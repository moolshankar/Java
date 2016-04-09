package Test;

public class SleepThread extends Thread {
	public void run(){
		try{
				System.out.println("Firs call");
					Thread.sleep(30000);
					System.out.println("Secponmd call");

		} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					System.out.println(e);
				}
			}
			
		

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SleepThread s1 = new SleepThread();
		SleepThread s2 = new SleepThread();
		s1.start();
		s2.start();
	}

}
