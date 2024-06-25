package Reference2;

public class InstanceMethodReference {
	public void saySomeThing() {
		System.out.println("Hello,this is non-static method");;
	}
	public static void main(String[] args) {
		
		InstanceMethodReference methodref=new InstanceMethodReference();
		Sayable sayable=methodref::saySomeThing;
		sayable.say();
		
		Sayable sayable2=new InstanceMethodReference()::saySomeThing;
        sayable2.say();
		
	}

}
