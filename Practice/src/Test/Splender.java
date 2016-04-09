package Test;

public class Splender extends Bike {
	int speed = 100;
	void run(){System.out.println("running safely with speed "+speed);}
	void print1(){System.out.println("child class function");}
		
		public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bike b = new Splender();//upcasting
	     System.out.println(b.speed);
	}

}
 