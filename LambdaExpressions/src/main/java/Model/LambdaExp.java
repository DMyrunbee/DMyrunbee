package Model;

public class LambdaExp {

	public static void main(String[] args) {
		
		//Thread Example without lambda
		Runnable r1=new Runnable() {
		public void run() {
			System.out.println("Thread1 is reunning...");
		}
			
		};
		Thread t1=new Thread(r1);
		t1.start();
		
		//Thread Example with Lambda
		Runnable r2=()->{
			System.out.println("Thread is running...");
		};
		Thread t2=new Thread(r2);
		t2.start();
		
	}
	
}
