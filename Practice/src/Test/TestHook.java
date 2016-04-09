package Test;

public class TestHook {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Runtime r = Runtime.getRuntime();
		r.addShutdownHook(new Thread1());
		System.out.println("Main Thread sleeping .. press ctrl+C for exit");
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			
		}

	}

}
