package nit.MethodRef1;

public class MethodReference2 {

	public static void threadStatus() {
		System.out.println("Thread is running...");
	}
	public static void main(String[] args) {
		{
			Thread t2=new Thread(MethodReference2::threadStatus);
		    t2.start();
		}

	}

}
