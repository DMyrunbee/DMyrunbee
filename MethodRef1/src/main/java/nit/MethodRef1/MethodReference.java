package nit.MethodRef1;

public class MethodReference {

	public static void saySomeThing() {
		System.out.println("Hello, this is static method");
	}
	public static void main(String[] args) {
		
		Sayable sayable=MethodReference::saySomeThing;
		sayable.say();

	}

	

}
