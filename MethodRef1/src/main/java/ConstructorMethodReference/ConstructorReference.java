package ConstructorMethodReference;

public class ConstructorReference {

	public static void main(String[] args) {


		Messagable hello=Message::new;
		hello.getMessage("Hello");

	}

}
