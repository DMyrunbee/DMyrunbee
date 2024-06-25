package Reference2;

public class InstanceMethodReference2 {

	public void printMsg() {
		System.out.println("Instance method");
	}
	public static void main(String[] args) {
		Thread t1=new Thread(new InstanceMethodReference2()::printMsg);
	    t1.start();
	}

}
