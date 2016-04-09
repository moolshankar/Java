package Test;

public class TestException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n =50;
		try
		{
			n=n/0;
			System.out.println("print after exception");
		}
			
		catch(ArithmeticException e){
			System.out.println("Aritnmatic exception occured");
		}
		
		System.out.println("Exiting ...");
		

	}

}
